package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Voluntario_Habilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Voluntario_HabilidadRepositoryImp implements  Voluntario_HabilidadRepository{
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Voluntario_Habilidad> getAllVoluntario_Habilidad(){
        String sql = "Select * from \"Voluntario_Habilidad\";";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Voluntario_Habilidad.class);
        }
    }
    @Override
    public Voluntario_Habilidad addVoluntario_Habilidad(Voluntario_Habilidad voluntario_habilidad){
        String sql = "insert into \"Voluntario_Habilidad\"(id_voluntario,id_habilidad) values(:id_v,:id_h);";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .addParameter("id_v", voluntario_habilidad.getId_voluntario())
                    .addParameter("id_h", voluntario_habilidad.getId_habilidad())
                    .executeUpdate().getKey();
            voluntario_habilidad.setId_voluntario_habilidad(id);
            return voluntario_habilidad;
        }
    }
    @Override
    public void deleteAllVoluntario_Habilidad(){
        String sql = "delete from \"Voluntario_Habilidad\";";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }
    @Override
    public Voluntario_Habilidad getVoluntario_HabilidadById(int id){
        String sql = "select * from \"Voluntario_Habilidad\" where id_voluntario_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Voluntario_Habilidad.class);
        }
    }
    @Override
    public void deleteVoluntario_HabilidadById(int id){
        String sql = "delete from \"Voluntario_Habilidad\" where id_voluntario_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }
    @Override
    public Voluntario_Habilidad updateVoluntario_HabilidadById(int id,Voluntario_Habilidad voluntario_habilidad){
        String sql = "update \"Voluntario_Habilidad\" set id_voluntario = :id_v, id_habilidad = :id_h where id_voluntario_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id",id)
                    .addParameter("id_v", voluntario_habilidad.getId_voluntario())
                    .addParameter("id_h", voluntario_habilidad.getId_habilidad())
                    .executeUpdate();
            voluntario_habilidad.setId_voluntario_habilidad(id);
            return voluntario_habilidad;
        }
    }

}
