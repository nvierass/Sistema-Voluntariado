package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Tarea;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class TareaService {

    private final TareaRepository tareaRepository;
    TareaService(TareaRepository tareaRepository){
        this.tareaRepository = tareaRepository;
    }

    @GetMapping("/tareas/")
    public List<Tarea> getAllTareas(){
        return tareaRepository.getAllTareas();
    }
    @PostMapping("/tareas/")
    public Tarea addTarea(@RequestBody Tarea tarea) {
        return tareaRepository.addTarea(tarea);
    }
    @DeleteMapping("/tareas/")
    public String deleteAllTareas(){
        tareaRepository.deleteAllTareas();
        return "Se han eliminado todas las tareas";
    }
    @PutMapping("/tareas/")
    public String updateAllTareas(){
        return "Método no permitido en esta URI";
    }

    @PostMapping("/tareas/{id}")
    public String addTarea(@PathVariable int id){
        return "Método no permitido en esta URI";
    }
    @GetMapping("/tareas/{id}")
    public Tarea getTarea(@PathVariable int id){
        return tareaRepository.getTareaById(id);
    }
    @DeleteMapping("/tareas/{id}")
    public String deleteTarea(@PathVariable int id){
        tareaRepository.deleteTareaById(id);
        return String.format("Se ha eliminado la tarea con id=%s",id);
    }
    @PutMapping("/tareas/{id}")
    public Tarea updateTareaById(@PathVariable int id,@RequestBody Tarea tarea){
        return tareaRepository.updateTareaById(id,tarea);
    }
}
