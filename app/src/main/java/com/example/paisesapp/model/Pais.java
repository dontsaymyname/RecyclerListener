package com.example.paisesapp.model;

import java.io.Serializable;

public class Pais implements Serializable {

    private String nome;
    private int qtdHabitantes;
    private String bandeira;
    private String idioma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdHabitantes() {
        return qtdHabitantes;
    }

    public void setQtdHabitantes(int qtdHabitantes) {
        this.qtdHabitantes = qtdHabitantes;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
