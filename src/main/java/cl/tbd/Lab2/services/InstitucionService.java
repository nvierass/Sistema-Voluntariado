package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Institucion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.net.URI;
import java.util.List;

@RestController
public class InstitucionService {

    private final InstitucionRepository institucionRepository;
    InstitucionService(InstitucionRepository institucionRepository){
        this.institucionRepository = institucionRepository;
    }

    @GetMapping("/instituciones/")
    public List<Institucion> getAllInstituciones(){
        return institucionRepository.getAllInstituciones();
    }
    @PostMapping("/instituciones/")
    public ResponseEntity<Institucion> addInstitution(@RequestBody Institucion institucion) {
        int id_nueva = institucionRepository.addInstitucion(institucion);
        return ResponseEntity.created(URI.create(String.format("/instituciones/%s", id_nueva))).body(institucion);
    }
    @DeleteMapping("/instituciones/")
    public void deleteAllInstituciones(){
        institucionRepository.deleteAllInstituciones();
    }
    //Update parcial
    @PatchMapping("/instituciones/")
    public ResponseEntity updatePatchInstitucion(){
        return ResponseEntity.badRequest().build();
    }
    //Update total
    @PutMapping("/instituciones/")
    public ResponseEntity updatePutInstitucion(){
        return ResponseEntity.badRequest().build();
    }


    @PostMapping("/instituciones/{id}")
    public ResponseEntity addInstitucion(@PathVariable int id){
        return ResponseEntity.badRequest().build();
    }
    @GetMapping("/instituciones/{id}")
    public Institucion getInstitucion(@PathVariable int id){
        return institucionRepository.getInstitucionById(id);
    }
    @DeleteMapping("/instituciones/{id}")
    public void deleteInstitucion(@PathVariable int id){
        institucionRepository.deleteInstitucionById(id);
    }

    @PutMapping("/instituciones/{id}")
    public void updatePutInstitucionById(@PathVariable int id,@RequestBody Institucion institucion){
        institucionRepository.putInstitucion(id,institucion);
    }


    @GetMapping("/instituciones/count")
    public String countInstituciones(){
        int total = institucionRepository.countInstitucion();
        return String.format("Existen %s instituciones",total);
    }


}
