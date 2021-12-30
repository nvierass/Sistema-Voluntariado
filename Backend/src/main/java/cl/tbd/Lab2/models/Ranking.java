package cl.tbd.Lab2.models;

public class Ranking {
    private int id_ranking;
    private int id_voluntario;
    private int id_tarea;
    private int puntaje;
    private boolean inscrito;
    private boolean aceptado;

    public int getId_ranking(){
        return this.id_ranking;
    }
    public int getId_voluntario(){
        return this.id_voluntario;
    }
    public int getId_tarea(){
        return this.id_tarea;
    }
    public int getPuntaje(){
        return this.puntaje;
    }
    public boolean getInscrito(){
        return this.inscrito;
    }
    public boolean getAceptado(){
        return this.aceptado;
    }

    public void setId_ranking(int id_ranking){
        this.id_ranking = id_ranking;
    }

    public void setId_voluntario(int id_voluntario) {
        this.id_voluntario = id_voluntario;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public void setInscrito(Boolean inscrito){
        this.inscrito = inscrito;
    }
    public void setAceptado(Boolean aceptado){
        this.aceptado = aceptado;
    }
}
