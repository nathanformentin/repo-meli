package com.nathan.exerciciosIndividuais.Aula4.Dakar;

public class Main {

    public static void main(String[] args) {
        Corrida corrida = new Corrida(1000, 50000, "Corrida1", 2);
        Carro carro1 = new Carro(100, 2, 4, "1234");
        Carro carro2 = new Carro(150, 2, 4, "125664");
        Carro carro3 = new Carro(100070, 2, 4, "120912091");
        corrida.registrarCarro(carro1);
        corrida.registrarCarro(carro2);
        corrida.registrarCarro(carro3);
        corrida.registrarMoto(100, 2, 4, "92794797");
        corrida.removerVeiculo(carro1);
        corrida.removerVeiculo("125664");
        corrida.registrarMoto(100, 2, 4, "92794797");
        corrida.determinaVencedor();
    }
}
