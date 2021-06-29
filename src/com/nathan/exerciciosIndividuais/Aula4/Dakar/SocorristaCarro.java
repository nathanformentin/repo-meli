package com.nathan.exerciciosIndividuais.Aula4.Dakar;

public class SocorristaCarro extends Carro {
    public SocorristaCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa);
    }

    public void socorrer(Carro carro) {
        System.out.println("Socorrendo carro " + carro.placa);
    }
}
