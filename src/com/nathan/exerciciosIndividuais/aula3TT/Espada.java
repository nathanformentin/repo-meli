package com.nathan.exerciciosIndividuais.aula3TT;

public class Espada extends Arma {

    public Espada(String tipo, boolean quebravel, double dano) {
        super(tipo, quebravel, dano);
    }

    @Override
    public void ataque() {
        System.out.println("Atacando com a espada");
    }
}
