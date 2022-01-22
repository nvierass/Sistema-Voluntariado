package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Ranking;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface RankingRepository {
    public List<Ranking> getAllRankings();
    public Ranking addRanking(Ranking ranking);
    public void deleteAllRankings();
    public Ranking getRankingById(int id);
    public void deleteRankingById(int id);
    public Ranking updateRankingById(int id,Ranking ranking);
    public List<Ranking> getVoluntariosInscritosByTareaId(int id);
}
