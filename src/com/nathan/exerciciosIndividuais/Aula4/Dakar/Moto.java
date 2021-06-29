package com.nathan.exerciciosIndividuais.Aula4.Dakar;

public class Moto extends Veiculo {

    public Moto(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        super(velocidade, aceleracao, anguloDeGiro, patente);
        this.numeroRodas = 2;
        this.peso = 300;

    }
}
