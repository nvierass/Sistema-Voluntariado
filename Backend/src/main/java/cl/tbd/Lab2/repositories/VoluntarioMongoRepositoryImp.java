package cl.tbd.Lab2.repositories;

import java.util.ArrayList;
import java.util.Arrays;

import com.mongodb.client.AggregateIterable;
import org.bson.BsonNull;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.bson.Document;

@Repository
public class VoluntarioMongoRepositoryImp implements VoluntarioMongoRepository {
        @Autowired
        MongoDatabase database;

        @Override
        public float promedioHabilidadVoluntario() {
                // MongoDatabase database = mongoClient.getDatabase("Voluntario");
                MongoCollection<Document> collection = database.getCollection("voluntarios");

                AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$lookup",
                                new Document("from", "habilidad")
                                                .append("localField", "habilidad")
                                                .append("foreignField", "codigo")
                                                .append("as", "grupo")),
                                new Document("$unwind",
                                                new Document("path", "$habilidad")),
                                new Document("$group",
                                                new Document("_id", "$rut")
                                                                .append("count",
                                                                                new Document("$sum", 1L))),
                                new Document("$group",
                                                new Document("_id", "average")
                                                                .append("average",
                                                                                new Document("$avg", "$count")))));

                ArrayList<Document> resulDocument = new ArrayList<>(2);
                for (Document document : result) {
                        resulDocument.add(document);
                }
                String cadena = String.valueOf(resulDocument.get(0));
                String[] auxiliar = cadena.split("=");
                String[] resultado = auxiliar[2].split("}");
                return Float.parseFloat(resultado[0]);
        }
}
