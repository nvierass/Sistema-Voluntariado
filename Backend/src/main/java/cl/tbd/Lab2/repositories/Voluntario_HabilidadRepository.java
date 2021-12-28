package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Voluntario_Habilidad;

import java.util.List;

public interface Voluntario_HabilidadRepository {
    public List<Voluntario_Habilidad> getAllVoluntario_Habilidad();
    public Voluntario_Habilidad addVoluntario_Habilidad(Voluntario_Habilidad voluntario_habilidad);
    public void deleteAllVoluntario_Habilidad();
    public Voluntario_Habilidad getVoluntario_HabilidadById(int id);
    public void deleteVoluntario_HabilidadById(int id);
    public Voluntario_Habilidad updateVoluntario_HabilidadById(int id,Voluntario_Habilidad voluntario_habilidad);
}
