package com.nathan.exerciciosIndividuais.aula3TT;

public class Arma {

    String tipo;
    boolean quebravel;
    double dano;

    public Arma(String tipo, boolean quebravel, double dano) {
        this.tipo = tipo;
        this.quebravel = quebravel;
        this.dano = dano;
    }

    void ataque() {
        System.out.println("Ataque comum");
    }

    public String getTipo() {
        return tipo;
    }
}
