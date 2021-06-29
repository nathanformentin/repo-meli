package com.nathan.exerciciosIndividuais.Aula4.Dakar;

public class Veiculo {

    double velocidade;
    double aceleracao;
    double anguloDeGiro;
    String placa;
    double peso;
    int numeroRodas;

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", numeroRodas=" + numeroRodas +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public double calculaScore() {
        return velocidade *  aceleracao / ( anguloDeGiro * (peso - numeroRodas * 100));
    }
}
