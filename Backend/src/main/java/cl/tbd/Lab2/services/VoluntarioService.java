package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Voluntario;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.util.List;

@RestController
public class VoluntarioService {

    private final VoluntarioRepository voluntarioRepository;
    VoluntarioService(VoluntarioRepository voluntarioRepository){
        this.voluntarioRepository = voluntarioRepository;
    }

    @GetMapping("/voluntarios/")
    public List<Voluntario> getAllVoluntarios(){
        return voluntarioRepository.getAllVoluntarios();
    }
    @PostMapping("/voluntarios/")
    public Voluntario addVoluntario(@RequestBody Voluntario voluntario) {
        return voluntarioRepository.addVoluntario(voluntario);
    }
    @DeleteMapping("/voluntarios/")
    public String deleteAllVoluntarios(){
        voluntarioRepository.deleteAllVoluntarios();
        return "Se han eliminado todas las instituciones";
    }
    @PutMapping("/voluntarios/")
    public String updateAllVoluntarios(){
        return "Método no permitido en esta URI";
    }

    @PostMapping("/voluntarios/{id}")
    public String addVoluntario(@PathVariable int id){
        return "Método no permitido en esta URI";
    }
    @GetMapping("/voluntarios/{id}")
    public Voluntario getVoluntario(@PathVariable int id){
        return voluntarioRepository.getVoluntarioById(id);
    }
    @DeleteMapping("/voluntarios/{id}")
    public String deleteVoluntario(@PathVariable int id){
        voluntarioRepository.deleteVoluntarioById(id);
        return String.format("Se ha eliminado el voluntario con id=%s",id);
    }
    @PutMapping("/voluntarios/{id}")
    public Voluntario updateVoluntarioById(@PathVariable int id,@RequestBody Voluntario voluntario){
        return voluntarioRepository.updateVoluntarioById(id,voluntario);
    }
}
