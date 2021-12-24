package cl.tbd.Lab2.models;

public class Voluntario {
    private int id_voluntario;
    private String rut;
    private String nombre;
    private String region;
    private String ciudad;
    private String telefono_contacto;
    private String fecha_nacimiento;
    private String correo;
    private boolean disponibilidad_lunes;
    private boolean disponibilidad_martes;
    private boolean disponibilidad_miercoles;
    private boolean disponibilidad_jueves;
    private boolean disponibilidad_viernes;
    private boolean disponibilidad_sabado;
    private boolean disponibilidad_domingo;


    public int getId_voluntario() {
        return id_voluntario;
    }
    public String getRut() {
        return rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRegion() {
        return region;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getTelefono_contacto() {
        return telefono_contacto;
    }
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public String getCorreo() {
        return correo;
    }
    public boolean getDisponibilidad_lunes() {
        return disponibilidad_lunes;
    }
    public boolean getDisponibilidad_martes() {
        return disponibilidad_martes;
    }
    public boolean getDisponibilidad_miercoles() {
        return disponibilidad_miercoles;
    }
    public boolean getDisponibilidad_jueves() {
        return disponibilidad_jueves;
    }
    public boolean getDisponibilidad_viernes() {
        return disponibilidad_viernes;
    }
    public boolean getDisponibilidad_sabado() {
        return disponibilidad_sabado;
    }
    public boolean getDisponibilidad_domingo() {
        return disponibilidad_domingo;
    }

    public void setId_voluntario(int id_voluntario) {
        this.id_voluntario = id_voluntario;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setDisponibilidad_lunes(boolean disponibilidad_lunes) {
        this.disponibilidad_lunes = disponibilidad_lunes;
    }
    public void setDisponibilidad_martes(boolean disponibilidad_martes) {
        this.disponibilidad_martes = disponibilidad_martes;
    }
    public void setDisponibilidad_miercoles(boolean disponibilidad_miercoles) {
        this.disponibilidad_miercoles = disponibilidad_miercoles;
    }
    public void setDisponibilidad_jueves(boolean disponibilidad_jueves) {
        this.disponibilidad_jueves = disponibilidad_jueves;
    }
    public void setDisponibilidad_viernes(boolean disponibilidad_viernes) {
        this.disponibilidad_viernes = disponibilidad_viernes;
    }
    public void setDisponibilidad_sabado(boolean disponibilidad_sabado) {
        this.disponibilidad_sabado = disponibilidad_sabado;
    }
    public void setDisponibilidad_domingo(boolean disponibilidad_domingo) {
        this.disponibilidad_domingo = disponibilidad_domingo;
    }
}
