package cl.tbd.Lab2.models;

import org.springframework.data.annotation.Id;

public class HabilidadMongo {
    @Id
    private String id;
    private String nombre;
    private String description;
    private String codigo;

    public HabilidadMongo(String id, String nombre, String description, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

}
