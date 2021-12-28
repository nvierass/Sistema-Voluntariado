package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Ranking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class RankingRepositoryImp implements RankingRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Ranking> getAllRankings(){
        String sql = "Select * from \"Ranking\";";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Ranking.class);
        }
    }

    @Override
    public Ranking addRanking(Ranking ranking){
        String sql = "insert into \"Ranking\"(id_voluntario,id_tarea,requisitos_cumplidos) values (:id_voluntario, :id_tarea,:requisitos_cumplidos);";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .addParameter("id_voluntario", ranking.getId_voluntario() )
                    .addParameter("id_tarea", ranking.getId_tarea())
                    .addParameter("requisitos_cumplidos", ranking.getRequisitos_cumplidos())
                    .executeUpdate().getKey();
            ranking.setId_ranking(id);
            return ranking;
        }
    }
    @Override
    public void deleteAllRankings(){
        String sql = "delete from \"Ranking\";";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }

    @Override
    public Ranking getRankingById(int id){
        String sql = "select * from \"Ranking\" where id_ranking = :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Ranking.class);
        }
    }

    @Override
    public void deleteRankingById(int id){
        String sql = "delete from \"Ranking\" where id_ranking = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }

    @Override
    public Ranking updateRankingById(int id,Ranking ranking){
        String sql = "update \"Ranking\" set id_voluntario =:id_voluntario," +
                "id_tarea = :id_tarea," +
                "requisitos_cumplidos = :requisitos_cumplidos" +
                " where id_ranking = :id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id",id)
                    .addParameter("id_voluntario", ranking.getId_voluntario() )
                    .addParameter("id_tarea", ranking.getId_tarea())
                    .addParameter("requisitos_cumplidos", ranking.getRequisitos_cumplidos())
                    .executeUpdate();
            ranking.setId_ranking(id);
            return ranking;
        }
    }
}
