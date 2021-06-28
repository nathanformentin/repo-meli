package com.nathan.exerciciosIndividuais.aula3TT;

public class Arqueiro implements Classe {
    int destreza;

    public Arqueiro(int destreza) {
        this.destreza = destreza;
    }
    public void usaPoder() {
        System.out.println("Rajada de Flechas");
    }
}
