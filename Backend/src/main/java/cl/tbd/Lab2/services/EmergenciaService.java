package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Emergencia;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.util.List;

@RestController
public class EmergenciaService {

    private final EmergenciaRepository emergenciaRepository;
    EmergenciaService(EmergenciaRepository emergenciaRepository){
        this.emergenciaRepository = emergenciaRepository;
    }

    @GetMapping("/emergencias/")
    public List<Emergencia> getAllEmergencias(){
        return emergenciaRepository.getAllEmergencias();
    }

    @PostMapping("/emergencias/")
    public Emergencia addEmergencia(@RequestBody Emergencia emergencia){
        return emergenciaRepository.addEmergencia(emergencia);
    }
    @DeleteMapping("/emergencias/")
    public String deleteAllEmergencias(){
        emergenciaRepository.deleteAllEmergencias();
        return "Se han eliminado todas las emergencias";
    }
    @PutMapping("/emergencias/")
    public String updateAllEmergencias(){
        return "Método no permitido en esta URI";
    }

    @PostMapping("/emergencias/{id}")
    public String addEmergencia(@PathVariable int id){
        return "Método no permitido en esta URI";
    }
    @GetMapping("/emergencias/{id}")
    public Emergencia getEmergencia(@PathVariable int id){
        return emergenciaRepository.getEmergenciaById(id);
    }
    @DeleteMapping("/emergencias/{id}")
    public String deleteEmergencia(@PathVariable int id){
        emergenciaRepository.deleteEmergenciaById(id);
        return String.format("Se ha eliminado la emergencia con id=%s",id);
    }
    @PutMapping("/emergencias/{id}")
    public Emergencia updateEmergenciaById(@PathVariable int id,@RequestBody Emergencia emergencia){
        return emergenciaRepository.updateEmergenciaById(id,emergencia);
    }

}
