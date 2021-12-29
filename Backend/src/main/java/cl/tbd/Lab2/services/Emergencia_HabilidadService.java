package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Emergencia_Habilidad;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class Emergencia_HabilidadService {

    private final Emergencia_HabilidadRepository emergencia_HabilidadRepository;
    Emergencia_HabilidadService(Emergencia_HabilidadRepository emergencia_HabilidadRepository){
        this.emergencia_HabilidadRepository = emergencia_HabilidadRepository;
    }

    @GetMapping("/emergenciaHabilidades/")
    public List<Emergencia_Habilidad> getAllEmergenciaHabilidades(){
        return emergencia_HabilidadRepository.getAllEmergenciaHabilidades();
    }
    @PostMapping("/emergenciaHabilidades/")
    public Emergencia_Habilidad addEmergenciaHabilidad(@RequestBody Emergencia_Habilidad emergencia_Habilidad) {
        return emergencia_HabilidadRepository.addEmergenciaHabilidad(emergencia_Habilidad);
    }
    @DeleteMapping("/emergenciaHabilidades/")
    public String deleteAllEmergenciaHabilidades(){
        emergencia_HabilidadRepository.deleteAllEmergenciaHabilidades();
        return "Se han eliminado todas las emergencias habilidades";
    }
    @PutMapping("/emergenciaHabilidades/")
    public String updateAllEmergenciaHabilidades(){
        return "Método no permitido en esta URI";
    }

    @PostMapping("/emergenciaHabilidades/{id}")
    public String addEmergenciaHabilidad(@PathVariable int id){
        return "Método no permitido en esta URI";
    }
    @GetMapping("/emergenciaHabilidades/{id}")
    public Emergencia_Habilidad getEmergenciaHabilidad(@PathVariable int id){
        return emergencia_HabilidadRepository.getEmergenciaHabilidadById(id);
    }
    @DeleteMapping("/emergenciaHabilidades/{id}")
    public String deleteEmergenciaHabilidad(@PathVariable int id){
        emergencia_HabilidadRepository.deleteEmergenciaHabilidadById(id);
        return String.format("Se ha eliminado la emergencia habilidad con id=%s",id);
    }
    @PutMapping("/emergenciaHabilidades/{id}")
    public Emergencia_Habilidad updateEmergenciaHabilidadById(@PathVariable int id,@RequestBody Emergencia_Habilidad emergencia_Habilidad){
        return emergencia_HabilidadRepository.updateEmergenciaHabilidadById(id,emergencia_Habilidad);
    }
}
