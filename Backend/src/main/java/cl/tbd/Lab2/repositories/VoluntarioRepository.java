package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.Voluntario;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface VoluntarioRepository {
    public List<Voluntario> getAllVoluntarios();
    public Voluntario addVoluntario(Voluntario voluntario);
    public void deleteAllVoluntarios();
    public Voluntario getVoluntarioById(int id);
    public void deleteVoluntarioById(int id);
    public Voluntario updateVoluntarioById(int id,Voluntario voluntario);
}
