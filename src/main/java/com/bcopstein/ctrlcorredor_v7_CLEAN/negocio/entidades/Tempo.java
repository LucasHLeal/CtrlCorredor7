package com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades;

import javax.persistence.Embeddable;

@Embeddable
public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    protected Tempo(){}

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
}