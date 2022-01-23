package cl.tbd.Lab2.models;

public class Direccion {
    private String ciudad;
    private String region;

    public Direccion(String ciudad, String region) {
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
