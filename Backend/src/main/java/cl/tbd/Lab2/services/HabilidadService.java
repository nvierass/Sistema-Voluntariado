package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Habilidad;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class HabilidadService {

    private final HabilidadRepository habilidadRepository;
    HabilidadService(HabilidadRepository habilidadRepository){
        this.habilidadRepository = habilidadRepository;
    }

    @GetMapping("/habilidades/")
    public List<Habilidad> getAllHabilidades(){
        return habilidadRepository.getAllHabilidades();
    }
    @PostMapping("/habilidades/")
    public Habilidad addHabilidad(@RequestBody Habilidad habilidad) {
        return habilidadRepository.addHabilidad(habilidad);
    }
    @DeleteMapping("/habilidades/")
    public String deleteAllHabilidades(){
        habilidadRepository.deleteAllHabilidades();
        return "Se han eliminado todas las habilidades";
    }
    @PutMapping("/habilidades/")
    public String updateAllHabilidades(){
        return "Método no permitido en esta URI";
    }

    @PostMapping("/habilidades/{id}")
    public String addHabilidad(@PathVariable int id){
        return "Método no permitido en esta URI";
    }
    @GetMapping("/habilidades/{id}")
    public Habilidad getHabilidad(@PathVariable int id){
        return habilidadRepository.getHabilidadById(id);
    }
    @DeleteMapping("/habilidades/{id}")
    public String deleteHabilidad(@PathVariable int id){
        habilidadRepository.deleteHabilidadById(id);
        return String.format("Se ha eliminado la habilidad con id=%s",id);
    }
    @PutMapping("/habilidades/{id}")
    public Habilidad updateHabilidadById(@PathVariable int id,@RequestBody Habilidad habilidad){
        return habilidadRepository.updateHabilidadById(id,habilidad);
    }
}
