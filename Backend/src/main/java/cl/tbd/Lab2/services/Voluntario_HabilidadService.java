package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Voluntario;
import cl.tbd.Lab2.models.Voluntario_Habilidad;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.util.List;

@RestController
public class Voluntario_HabilidadService {

    private final Voluntario_HabilidadRepository voluntario_habilidadRepository;
    Voluntario_HabilidadService(Voluntario_HabilidadRepository voluntario_habilidadRepository){
        this.voluntario_habilidadRepository = voluntario_habilidadRepository;
    }

    @GetMapping("/voluntario_habilidad/")
    public List<Voluntario_Habilidad> getAllVoluntario_Habilidad(){
        return voluntario_habilidadRepository.getAllVoluntario_Habilidad();
    }
    @PostMapping("/voluntario_habilidad/")
    public Voluntario_Habilidad addVoluntario_Habilidad(@RequestBody Voluntario_Habilidad voluntario_habilidad){
        return voluntario_habilidadRepository.addVoluntario_Habilidad(voluntario_habilidad);
    }
    @DeleteMapping("/voluntario_habilidad/")
    public String deleteAllVoluntario_Habilidad(){
        voluntario_habilidadRepository.deleteAllVoluntario_Habilidad();
        return "Se han eliminado todas las relaciones voluntario_habilidad";
    }
    @PutMapping("/voluntario_habilidad/")
    public String updateAllVoluntario_Habilidad(){
        return "Método no permitido en esta URI";
    }


    @GetMapping("/voluntario_habilidad/{id}")
    public Voluntario_Habilidad getVoluntario_Habilidad(@PathVariable int id){
        return voluntario_habilidadRepository.getVoluntario_HabilidadById(id);
    }
    @PostMapping("/voluntario_habilidad/{id}")
    public String addTarea_Habilidad(@PathVariable int id){
        return "Método no permitido en esta URI";
    }
    @DeleteMapping("/voluntario_habilidad/{id}")
    public String deleteTarea_Habilidad(@PathVariable int id){
        voluntario_habilidadRepository.deleteVoluntario_HabilidadById(id);
        return String.format("Se ha eliminado la relación voluntario_habilidad con id=%s",id);
    }
    @PutMapping("/voluntario_habilidad/{id}")
    public Voluntario_Habilidad updateVoluntario_HabilidadById(@PathVariable int id,@RequestBody Voluntario_Habilidad voluntario_habilidad){
        return voluntario_habilidadRepository.updateVoluntario_HabilidadById(id,voluntario_habilidad);
    }
}
