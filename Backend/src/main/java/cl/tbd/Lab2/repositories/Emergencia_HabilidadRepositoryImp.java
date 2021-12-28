package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Emergencia_Habilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Emergencia_HabilidadRepositoryImp implements Emergencia_HabilidadRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Emergencia_Habilidad> getAllEmergenciaHabilidades(){
        String sql = "Select * from \"Emergencia_Habilidad\";";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Emergencia_Habilidad.class);
        }
    }

    @Override
    public Emergencia_Habilidad addEmergenciaHabilidad(Emergencia_Habilidad emergencia_Habilidad){
        String sql = "insert into \"Emergencia_Habilidad\"(id_emergencia,id_habilidad) values (:id_emergencia,:id_habilidad);";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .addParameter("id_emergencia", emergencia_Habilidad.getId_emergencia() )
                    .addParameter("id_habilidad", emergencia_Habilidad.getId_habilidad())
                    .executeUpdate().getKey();
            emergencia_Habilidad.setId_emergencia_habilidad(id);
            return emergencia_Habilidad;
        }
    }
    @Override
    public void deleteAllEmergenciaHabilidades(){
        String sql = "delete from \"Emergencia_Habilidad\";";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }

    @Override
    public Emergencia_Habilidad getEmergenciaHabilidadById(int id){
        String sql = "select * from \"Emergencia_Habilidad\" where id_emergencia_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Emergencia_Habilidad.class);
        }
    }

    @Override
    public void deleteEmergenciaHabilidadById(int id){
        String sql = "delete from \"Emergencia_Habilidad\" where id_emergencia_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }

    @Override
    public Emergencia_Habilidad updateEmergenciaHabilidadById(int id,Emergencia_Habilidad emergencia_Habilidad){
        String sql = "update \"Emergencia_Habilidad\" set id_emergencia =:id_emergencia," +
                "id_habilidad = :id_habilidad" +
                " where id_emergencia_habilidad = :id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id",id)
                    .addParameter("id_emergencia", emergencia_Habilidad.getId_emergencia() )
                    .addParameter("id_habilidad", emergencia_Habilidad.getId_habilidad())
                    .executeUpdate();
            emergencia_Habilidad.setId_emergencia_habilidad(id);
            return emergencia_Habilidad;
        }
    }
}
