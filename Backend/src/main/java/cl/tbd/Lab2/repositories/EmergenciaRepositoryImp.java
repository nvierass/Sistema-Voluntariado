package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Emergencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class EmergenciaRepositoryImp implements EmergenciaRepository{
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Emergencia> getAllEmergencias(){
        String sql = "Select id_emergencia,nombre_emergencia,estado_emergencia from \"Emergencia\" order by estado_emergencia,nombre_emergencia;";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Emergencia.class);
        }
    }

    @Override
    public Emergencia addEmergencia(Emergencia emergencia){
        String sql = "insert into \"Emergencia\"(institucion_encargada,nombre_emergencia,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,ciudad,region,location) values (:institucion,:nombre_emergencia,:estado,:descripcion,:nombre_coor,:rut_coor,:correo_coor,:ciudad,:region,ST_GeomFromText(:point, 4326))";
        try (Connection con = sql2o.open()) {
            String point = "POINT("+emergencia.getLongitud()+" "+emergencia.getLatitud()+")";
            int id = (int) con.createQuery(sql)
                    .addParameter("institucion", emergencia.getInstitucion_encargada())
                    .addParameter("nombre_emergencia", emergencia.getNombre_emergencia())
                    .addParameter("estado",emergencia.getEstado_emergencia())
                    .addParameter("descripcion", emergencia.getDescripcion())
                    .addParameter("nombre_coor", emergencia.getNombre_coordinador())
                    .addParameter("rut_coor", emergencia.getRut_coordinador())
                    .addParameter("correo_coor", emergencia.getCorreo_coordinador())
                    .addParameter("ciudad", emergencia.getCiudad())
                    .addParameter("region", emergencia.getRegion())
                    .addParameter("point", point)
                    .executeUpdate().getKey();
            emergencia.setId_emergencia(id);
            return emergencia;
        }
    }
    @Override
    public void deleteAllEmergencias(){
        String sql = "delete from \"Emergencia\";";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }

    @Override
    public Emergencia getEmergenciaById(int id){
        String sql = "select * from \"Emergencia\" where id_emergencia= :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Emergencia.class);
        }
    }
    public void deleteEmergenciaById(int id){
        String sql = "delete from \"Emergencia\" where id_emergencia = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }
    @Override
    public Emergencia updateEmergenciaById(int id,Emergencia emergencia){
        String sql = "update \"Emergencia\" set institucion_encargada = :institucion, estado_emergencia = :estado, descripcion = :descripcion, nombre_coordinador = :nombre_coor, rut_coordinador = :rut_coor, correo_coordinador = :correo_coor, ciudad = :ciudad, region = :region where id_emergencia = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .addParameter("institucion", emergencia.getInstitucion_encargada())
                    .addParameter("estado",emergencia.getEstado_emergencia())
                    .addParameter("descripcion", emergencia.getDescripcion())
                    .addParameter("nombre_coor", emergencia.getNombre_coordinador())
                    .addParameter("rut_coor", emergencia.getRut_coordinador())
                    .addParameter("correo_coor", emergencia.getCorreo_coordinador())
                    .addParameter("ciudad", emergencia.getCiudad())
                    .addParameter("region", emergencia.getRegion())
                    .executeUpdate();
            emergencia.setId_emergencia(id);
            return emergencia;
        }
    }

    @Override
    public List<Emergencia> getAllEmergenciasbyRegion(int id_region){
        String sql = "SELECT id_emergencia, institucion_encargada,nombre_emergencia,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,ciudad,region, ST_X(location) AS longitud, ST_Y(location) AS latitud FROM \"Emergencia\" AS e INNER JOIN division_regional AS r ON ST_WITHIN(e.location, r.geom) WHERE r.cod_regi = :id_region;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql)
                .addParameter("id_region", id_region)
                .executeAndFetch(Emergencia.class);
        }
    }
}
