package com.nathan.exerciciosIndividuais.aula3TT;

public class Cavaleiro implements Classe {

    int forca;

    public Cavaleiro(int forca) {
        this.forca = forca;
    }

    public void usaPoder() {
        System.out.println("Golpe Fulminante");
    }
}
