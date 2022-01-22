package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Ranking;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class RankingService {

    private final RankingRepository rankingRepository;
    RankingService(RankingRepository rankingRepository){
        this.rankingRepository = rankingRepository;
    }

    @GetMapping("/rankings/")
    public List<Ranking> getAllRankings(){
        return rankingRepository.getAllRankings();
    }
    @PostMapping("/rankings/")
    public Ranking addRanking(@RequestBody Ranking ranking) {
        return rankingRepository.addRanking(ranking);
    }
    @DeleteMapping("/rankings/")
    public String deleteAllRankings(){
        rankingRepository.deleteAllRankings();
        return "Se han eliminado todos los rankings";
    }
    @PutMapping("/rankings/")
    public String updateAllRankings(){
        return "Método no permitido en esta URI";
    }

    @PostMapping("/rankings/{id}")
    public String addRanking(@PathVariable int id){
        return "Método no permitido en esta URI";
    }
    @GetMapping("/rankings/{id}")
    public Ranking getRanking(@PathVariable int id){
        return rankingRepository.getRankingById(id);
    }
    @DeleteMapping("/rankings/{id}")
    public String deleteRanking(@PathVariable int id){
        rankingRepository.deleteRankingById(id);
        return String.format("Se ha eliminado el ranking con id=%s",id);
    }
    @PutMapping("/rankings/{id}")
    public Ranking updateRankingById(@PathVariable int id,@RequestBody Ranking ranking){
        return rankingRepository.updateRankingById(id,ranking);
    }

    @GetMapping("/voluntarios_tarea={id}")
    public List<Ranking> getVoluntariosByTareaId(@PathVariable int id){
        return rankingRepository.getVoluntariosInscritosByTareaId(id);
    }


}
