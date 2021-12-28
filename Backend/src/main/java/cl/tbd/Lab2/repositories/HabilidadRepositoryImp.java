package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Habilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class HabilidadRepositoryImp implements HabilidadRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Habilidad> getAllHabilidades(){
        String sql = "Select * from \"Habilidad\";";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Habilidad.class);
        }
    }

    @Override
    public Habilidad addHabilidad(Habilidad habilidad){
        String sql = "insert into \"Habilidad\"(criterio) values (:criterio);";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .addParameter("criterio", habilidad.getCriterio() )
                    .executeUpdate().getKey();
            habilidad.setId_habilidad(id);
            return habilidad;
        }
    }
    @Override
    public void deleteAllHabilidades(){
        String sql = "delete from \"Habilidad\";";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }

    @Override
    public Habilidad getHabilidadById(int id){
        String sql = "select * from \"Habilidad\" where id_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Habilidad.class);
        }
    }

    @Override
    public void deleteHabilidadById(int id){
        String sql = "delete from \"Habilidad\" where id_habilidad = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }

    @Override
    public Habilidad updateHabilidadById(int id,Habilidad habilidad){
        String sql = "update \"Habilidad\" set criterio =:criterio" +
                " where id_habilidad = :id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id",id)
                    .addParameter("criterio", habilidad.getCriterio() )
                    .executeUpdate();
            habilidad.setId_habilidad(id);
            return habilidad;
        }
    }
}
