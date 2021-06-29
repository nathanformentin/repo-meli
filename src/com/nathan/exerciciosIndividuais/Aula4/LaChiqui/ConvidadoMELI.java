package com.nathan.exerciciosIndividuais.Aula4.LaChiqui;

public class ConvidadoMELI implements Convidado {

    String nome;


    public ConvidadoMELI(String nome) {
        this.nome = nome;
    }

    @Override
    public void comerBolo() {
        System.out.println("Sou convidado MeLi nomeado " + nome + ". Viva la Chiqui!!!");
    }
}
