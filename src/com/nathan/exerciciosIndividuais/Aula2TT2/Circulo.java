package com.nathan.exerciciosIndividuais.Aula2TT2;

public class Circulo extends GeometricFigure {

    double radius;

    public Circulo(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
