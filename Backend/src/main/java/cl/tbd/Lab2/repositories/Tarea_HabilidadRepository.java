package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Tarea_Habilidad;
import java.util.List;

public interface Tarea_HabilidadRepository {
    public List<Tarea_Habilidad> getAllTarea_Habilidad();
    public Tarea_Habilidad addTarea_Habilidad(Tarea_Habilidad tarea_habilidad);
    public void deleteAllTarea_Habilidad();
    public Tarea_Habilidad getTarea_HabilidadById(int id);
    public void deleteTarea_HabilidadById(int id);
    public Tarea_Habilidad updateTarea_HabilidadById(int id,Tarea_Habilidad tarea_habilidad);
}
