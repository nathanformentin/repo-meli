package com.nathan.exerciciosIndividuais.aula3TT;

public class Character {

    String nome;
    Classe classe;
    int nivel;
    Arma arma;

    public Character(String nome, Classe classe, int nivel, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.arma = arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma.getTipo();
    }
}
