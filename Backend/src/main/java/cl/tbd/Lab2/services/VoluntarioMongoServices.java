package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Voluntario_Habilidad;
import cl.tbd.Lab2.models.Voluntario;
import cl.tbd.Lab2.models.Habilidad;
import cl.tbd.Lab2.repositories.VoluntarioMongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class VoluntarioMongoServices {
    public final VoluntarioMongoRepository voluntarioMongoRepository;

    public VoluntarioMongoServices(VoluntarioMongoRepository voluntarioMongoRepository) {
        this.voluntarioMongoRepository = voluntarioMongoRepository;
    }

    @GetMapping("/promedioHabilidad")
    public float promedioHabilidadVoluntarios() {
        return voluntarioMongoRepository.promedioHabilidadVoluntario();
    }

}
