package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Tarea;
import cl.tbd.Lab2.models.Voluntario;
import cl.tbd.Lab2.models.Ranking;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository {
    public List<Tarea> getAllTareas();
    public Tarea addTarea(Tarea tarea);
    public void deleteAllTareas();
    public Tarea getTareaById(int id);
    public void deleteTareaById(int id);
    public Tarea updateTareaById(int id,Tarea tarea);
    public List <Voluntario> findVoluntariosByTareaId(int id);
    public void generateRankingByTareaId(int id);
    public List<Tarea> getTareasByEmergenciaId(int id);
    public void generateAllRankings();
}
