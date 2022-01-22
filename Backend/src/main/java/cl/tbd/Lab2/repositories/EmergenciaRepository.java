package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Emergencia;

import java.util.List;


public interface EmergenciaRepository {
    public List<Emergencia> getAllEmergencias();
    public Emergencia addEmergencia(Emergencia emergencia);
    public void deleteAllEmergencias();
    public Emergencia getEmergenciaById(int id);
    public void deleteEmergenciaById(int id);
    public Emergencia updateEmergenciaById(int id,Emergencia emergencia);
    public List<Emergencia> getAllEmergenciasbyRegion(int id_region);
}
