package com.company.myapp;

import java.util.List;

public class Animal {
    private String nombreColor;
    private Integer numeroCollar;
    private List<Integer> horariosDeComidas;

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }

    public Integer getNumeroCollar() {
        return numeroCollar;
    }

    public void setNumeroCollar(Integer numeroCollar) {
        this.numeroCollar = numeroCollar;
    }

    public List<Integer> getHorariosDeComidas() {
        return horariosDeComidas;
    }

    public void setHorariosDeComidas(List<Integer> horariosDeComidas) {
        this.horariosDeComidas = horariosDeComidas;
    }
}
