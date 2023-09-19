package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeTurismo implements Serializable {

    private String nombre;
    private Integer foto;
    private String contacto;
    private String telefono;
    private String precio;


    public MoldeTurismo() {
    }

    public MoldeTurismo(String nombre, Integer foto, String contacto, String telefono, String precio) {
        this.nombre = nombre;
        this.foto = foto;
        this.contacto = contacto;
        this.telefono = telefono;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}