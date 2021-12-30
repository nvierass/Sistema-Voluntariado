package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Tarea;
import cl.tbd.Lab2.models.Voluntario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class TareaRepositoryImp implements TareaRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Tarea> getAllTareas(){
        String sql = "Select * from \"Tarea\";";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Tarea.class);
        }
    }

    @Override
    public Tarea addTarea(Tarea tarea){
        String sql = "insert into \"Tarea\"(emergencia,estado_tarea,nombre,descripcion) values (:emergencia,:estado_tarea,:nombre,:descripcion);";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .addParameter("emergencia", tarea.getEmergencia())
                    .addParameter("estado_tarea", tarea.getEstado_tarea())
                    .addParameter("nombre", tarea.getNombre())
                    .addParameter("descripcion", tarea.getDescripcion())
                    .executeUpdate().getKey();
            tarea.setId_tarea(id);
            return tarea;
        }
    }
    @Override
    public void deleteAllTareas(){
        String sql = "delete from \"Tarea\";";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }

    @Override
    public Tarea getTareaById(int id){
        String sql = "select * from \"Tarea\" where id_tarea = :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Tarea.class);
        }
    }

    @Override
    public void deleteTareaById(int id){
        String sql = "delete from \"Tarea\" where id_tarea = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }

    @Override
    public Tarea updateTareaById(int id,Tarea tarea){
        String sql = "update \"Tarea\" set emergencia =:emergencia," +
                "estado_tarea = :estado_tarea," +
                "nombre = :nombre," +
                "descripcion = :descripcion" +
                " where id_tarea = :id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id",id)
                    .addParameter("emergencia", tarea.getEmergencia() )
                    .addParameter("estado_tarea", tarea.getEstado_tarea())
                    .addParameter("nombre", tarea.getNombre())
                    .addParameter("descripcion", tarea.getDescripcion())
                    .executeUpdate();
            tarea.setId_tarea(id);
            return tarea;
        }
    }

    @Override
    public List <Voluntario> findVoluntariosByTareaId(int id){
        String sql = "select nombre,rut,region,ciudad,edad(fecha_nacimiento) from \"Voluntario\" as V INNER JOIN \"Ranking\" as R on V.id_voluntario = R.id_voluntario where id_tarea = :id and R.inscrito = true;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id", id).executeAndFetch(Voluntario.class);
        }
    }
}
