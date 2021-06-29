package com.nathan.exerciciosIndividuais.Aula4.LaChiqui;

public class ConvidadoStandard implements Convidado {

    String nome;

    public ConvidadoStandard(String nome) {
        this.nome = nome;
    }

    @Override
    public void comerBolo() {
        System.out.println("Sou o convidado Standard nomeado " + nome + " e estou comendo bolo");
    }
}
