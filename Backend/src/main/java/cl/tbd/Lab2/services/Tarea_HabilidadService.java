package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Tarea_Habilidad;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class Tarea_HabilidadService {

    private final Tarea_HabilidadRepository tarea_habilidadRepository;
    Tarea_HabilidadService(Tarea_HabilidadRepository tarea_habilidadRepository){
        this.tarea_habilidadRepository = tarea_habilidadRepository;
    }

    @GetMapping("/tarea_habilidad/")
    public List<Tarea_Habilidad> getAllTarea_Habilidad(){
        return tarea_habilidadRepository.getAllTarea_Habilidad();
    }

    @PostMapping("/tarea_habilidad/")
    public Tarea_Habilidad addTarea_Habilidad(@RequestBody Tarea_Habilidad tarea_habilidad){
        return tarea_habilidadRepository.addTarea_Habilidad(tarea_habilidad);
    }

    @DeleteMapping("/tarea_habilidad/")
    public String deleteAllTarea_Habilidad(){
        tarea_habilidadRepository.deleteAllTarea_Habilidad();
        return "Se han eliminado todas las relaciones tarea_habilidad";
    }

    @PutMapping("/tarea_habilidad/")
    public String updateAllTarea_Habilidad(){
        return "Método no permitido en esta URI";
    }

    @GetMapping("/tarea_habilidad/{id}")
    public Tarea_Habilidad getTarea_Habilidad(@PathVariable int id){
        return tarea_habilidadRepository.getTarea_HabilidadById(id);
    }

    @PostMapping("/tarea_habilidad/{id}")
    public String addTarea_Habilidad(@PathVariable int id){
        return "Método no permitido en esta URI";
    }

    @DeleteMapping("/tarea_habilidad/{id}")
    public String deleteTarea_Habilidad(@PathVariable int id){
        tarea_habilidadRepository.deleteTarea_HabilidadById(id);
        return String.format("Se ha eliminado la relación tarea_habilidad con id=%s",id);
    }

    @PutMapping("/tarea_habilidad/{id}")
    public Tarea_Habilidad updateTarea_HabilidadById(@PathVariable int id,@RequestBody Tarea_Habilidad tarea_habilidad){
        return tarea_habilidadRepository.updateTarea_HabilidadById(id,tarea_habilidad);
    }
}
