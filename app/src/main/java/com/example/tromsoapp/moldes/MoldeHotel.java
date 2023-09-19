package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {
    private Integer foto;
    private String nombre1;

    private String descripcion;

    private String precio;

    private String contacto;
    private String telefono;


    public MoldeHotel() {
    }

    public MoldeHotel(Integer foto, String nombre1, String descripcion, String precio, String contacto, String telefono) {
        this.foto = foto;
        this.nombre1 = nombre1;
        this.descripcion = descripcion;
        this.precio = precio;
        this.contacto = contacto;
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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
}