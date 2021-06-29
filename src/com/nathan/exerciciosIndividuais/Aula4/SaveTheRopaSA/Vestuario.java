package com.nathan.exerciciosIndividuais.Aula4.SaveTheRopaSA;

public class Vestuario {

    private String marca;
    private String modelo;

    public Vestuario(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "marca=" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}