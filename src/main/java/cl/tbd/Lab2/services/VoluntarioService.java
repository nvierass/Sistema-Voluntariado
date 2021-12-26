package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Voluntario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.net.URI;
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
    public ResponseEntity<Voluntario> addVoluntario(@RequestBody Voluntario voluntario) {
        int id_nuevo = voluntarioRepository.addVoluntario(voluntario);
        return ResponseEntity.created(URI.create(String.format("/voluntarios/%s", id_nuevo))).body(voluntario);
    }
    @DeleteMapping("/voluntarios/")
    public void deleteAllVoluntarios(){
        voluntarioRepository.deleteAllVoluntarios();
    }
    @PutMapping("/voluntarios/")
    public ResponseEntity updateAllVoluntarios(){
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/voluntarios/{id}")
    public ResponseEntity addVoluntario(@PathVariable int id){
        return ResponseEntity.badRequest().build();
    }
    @GetMapping("/voluntarios/{id}")
    public Voluntario getVoluntario(@PathVariable int id){
        return voluntarioRepository.getVoluntarioById(id);
    }
    @DeleteMapping("/voluntarios/{id}")
    public void deleteVoluntario(@PathVariable int id){
        voluntarioRepository.deleteVoluntarioById(id);
    }
    @PutMapping("/voluntarios/{id}")
    public void updateVoluntarioById(@PathVariable int id,@RequestBody Voluntario voluntario){
        voluntarioRepository.updateVoluntarioById(id,voluntario);
    }
}
