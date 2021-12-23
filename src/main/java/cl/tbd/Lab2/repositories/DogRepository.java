package cl.tbd.Lab2.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository {
    public int countDogs();
}
