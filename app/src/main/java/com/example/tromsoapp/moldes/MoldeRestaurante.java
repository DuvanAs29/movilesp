package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {

    private String nombreRes;
    private Integer fotoRes;
    private String rango;
    private String telefonoRes;
    private String recomendado;

    public MoldeRestaurante() {
    }

    public MoldeRestaurante(String nombreRes, Integer fotoRes, String rango, String telefonoRes, String recomendado) {
        this.nombreRes = nombreRes;
        this.fotoRes = fotoRes;
        this.rango = rango;
        this.telefonoRes = telefonoRes;
        this.recomendado = recomendado;
    }

    public String getNombreRes() {
        return nombreRes;
    }

    public void setNombreRes(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public Integer getFotoRes() {
        return fotoRes;
    }

    public void setFotoRes(Integer fotoRes) {
        this.fotoRes = fotoRes;
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

    public String getRecomendado() {
        return recomendado;
    }

    public void setRecomendado(String recomendado) {
        this.recomendado = recomendado;
    }
}
