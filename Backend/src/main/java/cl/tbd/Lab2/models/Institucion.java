package cl.tbd.Lab2.models;

public class Institucion {
    private int id_institucion;
    private String nombre;
    private String descripcion;

    public int getId_institucion() {
        return id_institucion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setId_institucion(int id_institucion) {
        this.id_institucion = id_institucion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
