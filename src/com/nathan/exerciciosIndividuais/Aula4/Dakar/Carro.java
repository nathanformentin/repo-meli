package com.nathan.exerciciosIndividuais.Aula4.Dakar;

public class Carro extends Veiculo {

    double peso;

    public Carro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa);
        this.peso = 1000;
        this.numeroRodas = 4;
    }
}
