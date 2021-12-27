package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Institucion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class IntitucionRepositoryImp implements InstitucionRepository {
    @Autowired
    private Sql2o sql2o;


    @Override
    public List<Institucion> getAllInstituciones(){
        String sql = "Select * from \"Institucion\";";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Institucion.class);
        }
    }

    @Override
    public Institucion addInstitucion(Institucion institucion){
        String sql = "insert into \"Institucion\"(nombre,descripcion) values (:nombre, :descripcion)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .addParameter("nombre", institucion.getNombre())
                    .addParameter("descripcion", institucion.getDescripcion())
                    .executeUpdate().getKey();
            institucion.setId_institucion(id);
            return institucion;
        }
    }

    @Override
    public void deleteAllInstituciones(){
        String sql = "delete from \"Institucion\";";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }

    @Override
    public Institucion getInstitucionById(int id){
        String sql = "select id_institucion,nombre,descripcion from \"Institucion\" where id_institucion = :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Institucion.class);
        }
    }

    @Override
    public void deleteInstitucionById(int id){
        String sql = "delete from \"Institucion\" where id_institucion = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }

    @Override
    public Institucion updateInstitucionById(int id,Institucion institucion){
        String sql = "update \"Institucion\" set nombre = :nombre, descripcion = :descripcion where id_institucion = :id";
        try (Connection con = sql2o.open()) {
                con.createQuery(sql)
                    .addParameter("id",id)
                    .addParameter("nombre", institucion.getNombre())
                    .addParameter("descripcion", institucion.getDescripcion())
                    .executeUpdate();
                institucion.setId_institucion(id);
                return institucion;
        }
    }

    @Override
    public int countInstitucion() {
        int total = 0;
        String sql = "SELECT COUNT(*) FROM \"Institucion\";";
        try(Connection conn = sql2o.open()){
            total = conn.createQuery(sql).executeScalar(Integer.class);
        }
        return total;
    }

}