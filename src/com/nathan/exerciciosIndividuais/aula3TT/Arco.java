package com.nathan.exerciciosIndividuais.aula3TT;

public class Arco extends Arma{

    String tipo;
    boolean quebravel;
    double dano;

    public Arco(String tipo, boolean quebravel, double dano) {
        super(tipo,quebravel,dano);
    }

    @Override
    public void ataque() {
        System.out.println("Atirando flecha!");
    }
}
