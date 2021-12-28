package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Emergencia_Habilidad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Emergencia_HabilidadRepository {
    public List<Emergencia_Habilidad> getAllEmergenciaHabilidades();
    public Emergencia_Habilidad addEmergenciaHabilidad(Emergencia_Habilidad emergencia_Habilidad);
    public void deleteAllEmergenciaHabilidades();
    public Emergencia_Habilidad getEmergenciaHabilidadById(int id);
    public void deleteEmergenciaHabilidadById(int id);
    public Emergencia_Habilidad updateEmergenciaHabilidadById(int id,Emergencia_Habilidad emergencia_Habilidad);
}