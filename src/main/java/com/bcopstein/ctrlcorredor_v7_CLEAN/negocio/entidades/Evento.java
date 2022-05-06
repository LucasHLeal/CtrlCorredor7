package com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades;
import javax.persistence.*;

@Entity
public class Evento {
    
    @Id
    private int id;
    private String nome;
    // Data do evento
    @Embedded
    private Data data;
    // Distancia percorrida
    private int distancia; // metros
    // Tempo que o corredor levou para percorrer a distancia
    @Embedded
    private Tempo tempo;
    

    public Evento(int id,String nome, int distancia, Data data, Tempo tempo) {
        this.id = id;
        this.nome = nome;
        this.distancia = distancia;
        this.data = data;
        this.tempo = tempo;
    }

    protected Evento() {}

    public int getDia() {
        return this.data.getDia();
    }

    public int getMes() {
        return this.data.getMes();
    }

    public int getAno() {
        return this.data.getAno();
    }

    public int getHoras() {
        return this.tempo.getHoras();
    }

    public int getMinutos() {
        return this.tempo.getMinutos();
    }

    public int getSegundos() {
        return this.tempo.getSegundos();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    

    public int getDistancia() {
        return distancia;
    }

    

    @Override
    public String toString() {
        return "Evento [ano=" + data.getAno() + ", dia=" + data.getDia() + ", distancia=" + distancia + ", horas=" + tempo.getHoras() + ", id=" + id
                + ", mes=" + data.getMes() + ", minutos=" + tempo.getMinutos() + ", nome=" + nome + ", segundos=" + tempo.getSegundos() + "]";
    }
}
