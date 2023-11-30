package com.core.modelo;

import java.util.Random;

public class Dado {
    private Random aleatorio;


    public String dibujarTres(){
        return "*";
    }
    public String dibujarCuatro(){
        return "*";
    }
    public String dibujarCinco(){
        return "*";
    }
    public String dibujarSeis(){
        return "*";
    }
    public String lanzarDado;

    @Override
    public String toString() {
        return "Dado{" +
                "aleatorio=" + aleatorio +
                ", lanzarDado='" + lanzarDado + '\'' +
                '}';
    }

    public Dado() {
    }

    public Dado(Random aleatorio, String lanzarDado) {
        this.aleatorio = aleatorio;
        this.lanzarDado = lanzarDado;
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }

    public String getLanzarDado() {
        return lanzarDado;
    }

    public void setLanzarDado(String lanzarDado) {
        this.lanzarDado = lanzarDado;
    }
}

