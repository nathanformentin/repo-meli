package com.nathan.exerciciosIndividuais.Aula4.Dakar;

public class SocorristaMoto extends Moto{

    public SocorristaMoto(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        super(velocidade, aceleracao, anguloDeGiro, patente);
    }

    public void socorrerMoto(Moto moto) {
        System.out.println("Socorrendo moto de placa: " + moto.getPlaca());
    }
}
