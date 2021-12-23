package cl.tbd.Lab2.models;

public class Dog {
    private int id;
    private String nombre;
    private int edad;


    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getId(){
        return this.id;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setId(int id){
        this.id = id;
    }
}
