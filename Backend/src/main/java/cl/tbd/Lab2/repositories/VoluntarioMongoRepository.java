package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.VoluntarioMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

public interface VoluntarioMongoRepository {
    public float promedioHabilidadVoluntario();
}
