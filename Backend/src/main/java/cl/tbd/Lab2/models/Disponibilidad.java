package cl.tbd.Lab2.models;

public class Disponibilidad {
    private Boolean lunes;
    private Boolean martes;
    private Boolean miercoles;
    private Boolean jueves;
    private Boolean viernes;
    private Boolean sabado;
    private Boolean domingo;

    public Disponibilidad(Boolean lunes, Boolean martes, Boolean miercoles, Boolean jueves, Boolean viernes,
            Boolean sabado, Boolean domingo) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
    }

}
