package cl.tbd.Lab2.models;

public class Tarea {
    private int id_tarea;
    private int emergencia;
    private String estado_tarea;
    private String nombre;
    private String descripcion;

    public int getId_tarea() {
        return id_tarea;
    }

    public int getEmergencia() {
        return emergencia;
    }

    public String getEstado_tarea() {
        return estado_tarea;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public void setEmergencia(int emergencia) {
        this.emergencia = emergencia;
    }

    public void setEstado_tarea(String estado_tarea) {
        this.estado_tarea = estado_tarea;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
