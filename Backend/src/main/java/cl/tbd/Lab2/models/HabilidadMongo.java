package cl.tbd.Lab2.models;

import org.springframework.data.annotation.Id;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class HabilidadMongo {
    @BsonId
    private ObjectId _id;
    private String nombre;
    private String description;
    private String codigo;

    public HabilidadMongo(ObjectId id, String nombre, String description, String codigo) {
        this._id = id;
        this.nombre = nombre;
        this.description = description;
        this.codigo = codigo;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

}
