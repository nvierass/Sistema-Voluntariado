package cl.tbd.Lab2.models;

public class Emergencia_Habilidad {
    private int id_emergencia_habilidad;
    private int id_emergencia;
    private int id_habilidad;

    public int getId_emergencia_habilidad() {
        return id_emergencia_habilidad;
    }
    public int getId_emergencia() {
        return id_emergencia;
    }
    public int getId_habilidad() {
        return id_habilidad;
    }


    public void setId_emergencia_habilidad(int id_emergencia_habilidad) {
        this.id_emergencia_habilidad = id_emergencia_habilidad;
    }
    public void setId_emergencia(int id_emergencia) {
        this.id_emergencia = id_emergencia;
    }
    public void setId_habilidad(int id_habilidad) {
        this.id_habilidad = id_habilidad;
    }
}
