package cl.tbd.Lab2.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.tbd.Lab2.repositories.*;

@RestController
public class DogService {

    private final DogRepository dogRepository;
    DogService(DogRepository dogRepository){
        this.dogRepository = dogRepository;
    }


    @GetMapping("/dogs/count")
    public String countDogs(){
        int total = dogRepository.countDogs();
        return String.format("Tienes %s perros!!", total);
    }
}

