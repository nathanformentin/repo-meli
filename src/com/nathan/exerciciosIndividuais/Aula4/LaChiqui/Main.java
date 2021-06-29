package com.nathan.exerciciosIndividuais.Aula4.LaChiqui;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FogoArtificioIndividual fogo = new FogoArtificioIndividual("boom");
        FogoArtificioIndividual fogo2 = new FogoArtificioIndividual("blewwww");
        FogoArtificioIndividual fogo3 = new FogoArtificioIndividual("XABLAU");
        FogoArtificioIndividual fogo4 = new FogoArtificioIndividual("VUM");
        PacoteFogoArtificio pacoteFogos = new PacoteFogoArtificio();
        pacoteFogos.addFogoArtificio(fogo3);
        pacoteFogos.addFogoArtificio(fogo4);
        Convidado convidado1 = new ConvidadoMELI("renato");
        Convidado convidado2 = new ConvidadoStandard("sergio");
        Marte organizer = new Marte();
        organizer.addFogoArtificio(fogo);
        organizer.addFogoArtificio(fogo2);
        organizer.addFogoArtificio(pacoteFogos);
        organizer.addConvidado(convidado1);
        organizer.addConvidado(convidado2);
        organizer.iniciaFesta();
    }
}
