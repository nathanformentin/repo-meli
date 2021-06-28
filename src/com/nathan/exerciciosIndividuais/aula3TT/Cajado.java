package com.nathan.exerciciosIndividuais.aula3TT;

public class Cajado extends Arma {

    public Cajado(String tipo, boolean quebravel, double dano) {
        super(tipo, quebravel, dano);
    }

    @Override
    void ataque() {
        System.out.println("Dano arcano");
    }
}
