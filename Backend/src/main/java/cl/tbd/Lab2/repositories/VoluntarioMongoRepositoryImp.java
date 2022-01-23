package cl.tbd.Lab2.repositories;

import java.util.ArrayList;
import java.util.Arrays;

import com.mongodb.client.AggregateIterable;
import org.bson.BsonNull;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.bson.Document;

public class VoluntarioMongoRepositoryImp implements VoluntarioMongoRepository {
    @Autowired
    MongoDatabase dabatase;

    @Override
    public float promedioHabilidadVoluntario(){
          

        ArrayList<Document> resulDocument = new ArrayList<>(2);
        for (Document document : result) {
            resulDocument.add(document);
        }
        String cadena = String.valueOf(resultDocumento.get(0));
        String
    }
}
