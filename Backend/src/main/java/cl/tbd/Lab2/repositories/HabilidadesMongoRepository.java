package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.HabilidadMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "habilidades", path = "habilidades")
public interface HabilidadesMongoRepository extends MongoRepository<HabilidadMongo, String> {
    List<HabilidadMongo> findByCode(@Param("codigo") String codigo);

}
