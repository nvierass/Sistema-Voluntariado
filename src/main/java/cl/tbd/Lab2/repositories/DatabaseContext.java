package cl.tbd.Lab2.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sql2o.Sql2o;

@Configuration
public class DatabaseContext {
    private String url = "jdbc:postgresql://127.0.0.1:5432/Test";
    private String username = "postgres";
    private String password = "postgres";   
    @Bean
    public Sql2o sql2o(){
        return new Sql2o(url, username, password);
    }
}