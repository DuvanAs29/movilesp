package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {
  private   String nombre1;
  private String precio;
  private String telefono;
  private Integer foto;
  private String descripcion;
  private Integer fotoAdicional;

    public MoldeHotel() {
    }

    public MoldeHotel(String nombre1, String precio, String telefono, Integer foto, String descripcion, Integer fotoAdicional) {
        this.nombre1 = nombre1;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.descripcion = descripcion;
        this.fotoAdicional = fotoAdicional;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getFotoAdicional() {
        return fotoAdicional;
    }

    public void setFotoAdicional(Integer fotoAdicional) {
        this.fotoAdicional = fotoAdicional;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
