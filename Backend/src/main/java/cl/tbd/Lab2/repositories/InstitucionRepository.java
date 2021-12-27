package cl.tbd.Lab2.repositories;

import org.springframework.stereotype.Repository;
import cl.tbd.Lab2.models.Institucion;

import java.util.List;

@Repository
public interface InstitucionRepository {
    public int countInstitucion();
    public List<Institucion> getAllInstituciones();
    public Institucion addInstitucion(Institucion institucion);
    public void deleteAllInstituciones();
    public Institucion getInstitucionById(int id);
    public void deleteInstitucionById(int id);
    public Institucion updateInstitucionById(int id,Institucion institucion);
}
