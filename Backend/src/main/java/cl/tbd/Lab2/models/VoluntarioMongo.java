package cl.tbd.Lab2.models;

import org.springframework.data.annotation.Id;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

public class VoluntarioMongo {
    @BsonId
    ObjectId _id;
    private String nombre;
    private String apellido;
    private String rut;
    private Direccion direccion;
    private String email;
    private List<String> habilidades;
    private Date fecha_nacimiento;
    private Disponibilidad disponibilidad;

    public VoluntarioMongo(ObjectId _id, String nombre, String apellido, String rut, Direccion direccion,
            String email, List<String> habilidades, Date fecha_nacimiento, Disponibilidad disponibilidad) {
        this._id = _id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
        this.email = email;
        this.habilidades = habilidades;
        this.fecha_nacimiento = fecha_nacimiento;
        this.disponibilidad = disponibilidad;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
