package cl.tbd.Lab2.repositories;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sql2o.Sql2o;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

@Configuration
public class DatabaseContext {
    @Value("${spring.datasource.url}")
    private String url;// = "jdbc:postgresql://127.0.0.1:5432/BD_TBD";
    @Value("${spring.datasource.username}")
    private String username;// = "postgres";
    @Value("${spring.datasource.password}")
    private String password;// = "postgres";
    @Value("${spring.data.mongodb.database}")
    private String dbName;

    @Bean
    public Sql2o sql2o() {
        return new Sql2o(url, username, password);

    }

    @Bean
    MongoDatabase database() {
        // Configuracion de codec para parsear POJO
        CodecRegistry defaultCodecRegistry = MongoClientSettings.getDefaultCodecRegistry();
        CodecRegistry fromProvider = CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(defaultCodecRegistry, fromProvider);

        MongoClient mongoClient = MongoClients.create();
        MongoDatabase database = mongoClient.getDatabase(dbName).withCodecRegistry(pojoCodecRegistry);
        System.out.println("dbName:" + dbName);
        return database;
    }
}