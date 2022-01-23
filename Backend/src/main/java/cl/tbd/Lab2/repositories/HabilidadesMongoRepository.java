package cl.tbd.Lab2.repositories;

import cl.tbd.Lab2.models.HabilidadMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

@RepositoryRestResource(collectionResourceRel = "habilidad", path = "habilidad")
public interface HabilidadesMongoRepository extends MongoRepository<HabilidadMongo, ObjectId> {
    List<HabilidadMongo> findByCodigo(@Param("codigo") String codigo);

}
