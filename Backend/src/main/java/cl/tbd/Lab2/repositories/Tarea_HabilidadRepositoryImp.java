package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Tarea_Habilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Tarea_HabilidadRepositoryImp implements Tarea_HabilidadRepository{
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Tarea_Habilidad> getAllTarea_Habilidad(){
        String sql = "select * from \"Tarea_Habilidad\";";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Tarea_Habilidad.class);
        }
    }

    @Override
    public Tarea_Habilidad addTarea_Habilidad(Tarea_Habilidad tarea_habilidad){
        String sql = "insert into \"Tarea_Habilidad\"(id_tarea,id_habilidad) values(:id_t,:id_h);";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .addParameter("id_t", tarea_habilidad.getId_tarea())
                    .addParameter("id_h", tarea_habilidad.getId_habilidad())
                    .executeUpdate().getKey();
            tarea_habilidad.setId_tarea_habilidad(id);
            return tarea_habilidad;
        }
    }

    @Override
    public void deleteAllTarea_Habilidad(){
        String sql = "delete from \"Tarea_Habilidad\";";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }

    @Override
    public Tarea_Habilidad getTarea_HabilidadById(int id){
        String sql = "select * from \"Tarea_Habilidad\" where id_tarea_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Tarea_Habilidad.class);
        }
    }

    @Override
    public void deleteTarea_HabilidadById(int id){
        String sql = "delete from \"Tarea_Habilidad\" where id_tarea_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }

    @Override public Tarea_Habilidad updateTarea_HabilidadById(int id,Tarea_Habilidad tarea_habilidad){
        String sql = "update \"Tarea_Habilidad\" set id_tarea = :id_t, id_habilidad = :id_h where id_tarea_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id",id)
                    .addParameter("id_t", tarea_habilidad.getId_tarea())
                    .addParameter("id_h", tarea_habilidad.getId_habilidad())
                    .executeUpdate();
            tarea_habilidad.setId_tarea_habilidad(id);
            return tarea_habilidad;
        }
    }
}
