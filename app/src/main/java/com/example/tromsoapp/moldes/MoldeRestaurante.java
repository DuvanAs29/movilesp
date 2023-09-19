package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {


    private Integer fotoRes;
    private String nombreRes;
    private String rango;
    private String telefonoRes;

    private String contactoRes;
    private String recomendado;

    public MoldeRestaurante() {
    }

    public MoldeRestaurante(Integer fotoRes, String nombreRes, String rango, String telefonoRes, String contactoRes, String recomendado) {
        this.fotoRes = fotoRes;
        this.nombreRes = nombreRes;
        this.rango = rango;
        this.telefonoRes = telefonoRes;
        this.contactoRes = contactoRes;
        this.recomendado = recomendado;
    }

    public Integer getFotoRes() {
        return fotoRes;
    }

    public void setFotoRes(Integer fotoRes) {
        this.fotoRes = fotoRes;
    }

    public String getNombreRes() {
        return nombreRes;
    }

    public void setNombreRes(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getTelefonoRes() {
        return telefonoRes;
    }

    public void setTelefonoRes(String telefonoRes) {
        this.telefonoRes = telefonoRes;
    }

    public String getContactoRes() {
        return contactoRes;
    }

    public void setContactoRes(String contactoRes) {
        this.contactoRes = contactoRes;
    }

    public String getRecomendado() {
        return recomendado;
    }

    public void setRecomendado(String recomendado) {
        this.recomendado = recomendado;
    }
}