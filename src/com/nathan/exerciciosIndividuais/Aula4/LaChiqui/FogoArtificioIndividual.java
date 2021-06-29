package com.nathan.exerciciosIndividuais.Aula4.LaChiqui;

public class FogoArtificioIndividual implements FogoArtificio{

    String barulho;

    public FogoArtificioIndividual(String barulho) {
        this.barulho = barulho;
    }

    public void estoura() {
        System.out.println(barulho + "!!!!!!!");
    }

}
