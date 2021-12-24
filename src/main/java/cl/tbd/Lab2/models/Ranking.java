package cl.tbd.Lab2.models;

public class Ranking {
    private int id_ranking;
    private int id_voluntario;
    private int id_tarea;
    private int requisitos_cumplidos;

    public int getId_ranking(){
        return this.id_ranking;
    }
    public int getId_voluntario(){
        return this.id_voluntario;
    }
    public int getId_tarea(){
        return this.id_tarea;
    }
    public int getRequisitos_cumplidos(){
        return this.requisitos_cumplidos;
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

    public void setRequisitos_cumplidos(int requisitos_cumplidos) {
        this.requisitos_cumplidos = requisitos_cumplidos;
    }
}
