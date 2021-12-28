package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Habilidad;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface HabilidadRepository {
    public List<Habilidad> getAllHabilidades();
    public Habilidad addHabilidad(Habilidad habilidad);
    public void deleteAllHabilidades();
    public Habilidad getHabilidadById(int id);
    public void deleteHabilidadById(int id);
    public Habilidad updateHabilidadById(int id,Habilidad habilidad);
}