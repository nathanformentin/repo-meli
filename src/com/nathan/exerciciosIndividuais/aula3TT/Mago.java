package com.nathan.exerciciosIndividuais.aula3TT;

public class Mago implements Classe {

    int inteligencia;
    public Mago(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void usaPoder() {
        System.out.println("Bola de fogo");
    }

}
