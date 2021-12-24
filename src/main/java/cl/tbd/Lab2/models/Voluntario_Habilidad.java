package cl.tbd.Lab2.models;

public class Voluntario_Habilidad {
    private int id_voluntario_habilidad;
    private int id_voluntario;
    private int id_habilidad;

    public int getId_voluntario_habilidad() {
        return id_voluntario_habilidad;
    }
    public int getId_voluntario() {
        return id_voluntario;
    }
    public int getId_habilidad() {
        return id_habilidad;
    }

    public void setId_voluntario_habilidad(int id_voluntario_habilidad) {
        this.id_voluntario_habilidad = id_voluntario_habilidad;
    }
    public void setId_voluntario(int id_voluntario) {
        this.id_voluntario = id_voluntario;
    }
    public void setId_habilidad(int id_habilidad) {
        this.id_habilidad = id_habilidad;
    }
}