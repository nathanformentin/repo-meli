package com.nathan.exerciciosIndividuais.Aula4.LaChiqui;

import java.util.ArrayList;
import java.util.List;

public class Marte {

    List<FogoArtificio> listaFogos = new ArrayList<>();
    List<Convidado> listaConvidados = new ArrayList<>();

    public void distribuiBolo() {
        for (Convidado convidado : listaConvidados) {
            convidado.comerBolo();
        }
    }

    public void estouraFoguete() {
        for (FogoArtificio fogoArtificio : listaFogos) {
            fogoArtificio.estoura();
        }
    }

    public void addFogoArtificio(FogoArtificio fogoArtificio) {
        listaFogos.add(fogoArtificio);
    }

    public void addConvidado(Convidado convidado) {
        listaConvidados.add(convidado);
    }

    public void iniciaFesta() {
        distribuiBolo();
        estouraFoguete();
    }



}
