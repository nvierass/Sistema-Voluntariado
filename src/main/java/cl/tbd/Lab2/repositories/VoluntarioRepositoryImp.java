package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Voluntario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class VoluntarioRepositoryImp implements VoluntarioRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Voluntario> getAllVoluntarios(){
        String sql = "Select * from \"Voluntario\";";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Voluntario.class);
        }
    }

    @Override
    public int addVoluntario(Voluntario voluntario){
        String sql = "insert into \"Voluntario\"(rut,nombre,region,ciudad,telefono_contacto,fecha_nacimiento,correo,disponibilidad_lunes," +
                "disponibilidad_martes,disponibilidad_miercoles,disponibilidad_jueves,disponibilidad_viernes,disponibilidad_sabado," +
                "disponibilidad_domingo) values (:rut, :nombre,:region,:ciudad,:telefono,:fecha_nac,:correo,:disp_lun,:disp_mar,:disp_mie,:disp_jue,:disp_vie,:disp_sab,:disp_dom);";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql)
                    .addParameter("rut", voluntario.getRut() )
                    .addParameter("nombre", voluntario.getNombre())
                    .addParameter("region", voluntario.getRegion())
                    .addParameter("ciudad", voluntario.getCiudad())
                    .addParameter("telefono", voluntario.getTelefono_contacto())
                    .addParameter("correo", voluntario.getCorreo())
                    .addParameter("fecha_nac",voluntario.getFecha_nacimiento())
                    .addParameter("disp_lun", voluntario.getDisponibilidad_lunes())
                    .addParameter("disp_mar", voluntario.getDisponibilidad_martes())
                    .addParameter("disp_mie", voluntario.getDisponibilidad_miercoles())
                    .addParameter("disp_jue", voluntario.getDisponibilidad_jueves())
                    .addParameter("disp_vie", voluntario.getDisponibilidad_viernes())
                    .addParameter("disp_sab", voluntario.getDisponibilidad_sabado())
                    .addParameter("disp_dom", voluntario.getDisponibilidad_domingo())
                    .executeUpdate().getKey(int.class);
        }
    }
    @Override
    public void deleteAllVoluntarios(){
        String sql = "delete from \"Voluntario\";";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }

    @Override
    public Voluntario getVoluntarioById(int id){
        String sql = "select * from \"Voluntario\" where id_voluntario = :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Voluntario.class);
        }
    }

    @Override
    public void deleteVoluntarioById(int id){
        String sql = "delete from \"Voluntario\" where id_voluntario = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }

    @Override
    public void updateVoluntarioById(int id,Voluntario voluntario){
        String sql = "update \"Voluntario\" set rut =:rut," +
                "nombre = :nombre," +
                "region = :region," +
                "ciudad = :ciudad," +
                "telefono_contacto = :telefono," +
                "fecha_nacimiento = :fecha_nac," +
                "correo = :correo," +
                "disponibilidad_lunes = :disp_lun," +
                "disponibilidad_martes = :disp_mar," +
                "disponibilidad_miercoles = :disp_mie," +
                "disponibilidad_jueves = :disp_jue," +
                "disponibilidad_viernes = :disp_vie," +
                "disponibilidad_sabado = :disp_sab," +
                "disponibilidad_domingo = :disp_dom" +
                " where id_voluntario = :id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id",id)
                    .addParameter("rut", voluntario.getRut() )
                    .addParameter("nombre", voluntario.getNombre())
                    .addParameter("region", voluntario.getRegion())
                    .addParameter("ciudad", voluntario.getCiudad())
                    .addParameter("telefono", voluntario.getTelefono_contacto())
                    .addParameter("fecha_nac",voluntario.getFecha_nacimiento())
                    .addParameter("correo", voluntario.getCorreo())
                    .addParameter("disp_lun", voluntario.getDisponibilidad_lunes())
                    .addParameter("disp_mar", voluntario.getDisponibilidad_martes())
                    .addParameter("disp_mie", voluntario.getDisponibilidad_miercoles())
                    .addParameter("disp_jue", voluntario.getDisponibilidad_jueves())
                    .addParameter("disp_vie", voluntario.getDisponibilidad_viernes())
                    .addParameter("disp_sab", voluntario.getDisponibilidad_sabado())
                    .addParameter("disp_dom", voluntario.getDisponibilidad_domingo())
                    .executeUpdate();
        }
    }
}
