package com.nathan.exerciciosIndividuais.Aula4.LaChiqui;

import java.util.ArrayList;
import java.util.List;

public class PacoteFogoArtificio implements FogoArtificio {


    List<FogoArtificioIndividual> pacote = new ArrayList<>();

    public void addFogoArtificio(FogoArtificioIndividual fogoArtificio) {
        pacote.add(fogoArtificio);
    }



    @Override
    public void estoura() {
        System.out.println("Estourando pacote!");
        for (FogoArtificioIndividual fogoArtificio : pacote) {
            fogoArtificio.estoura();
        }
    }
}
