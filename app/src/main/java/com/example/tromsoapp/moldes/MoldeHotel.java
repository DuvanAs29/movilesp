package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {
  private   String nombre1;
  private String precio;
  private String telefono;
  private Integer foto;

    public MoldeHotel() {
    }

    public MoldeHotel(String nombre1, String precio, String telefono, Integer foto) {
        this.nombre1 = nombre1;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
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
