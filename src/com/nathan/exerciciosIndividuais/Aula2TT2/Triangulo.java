package com.nathan.exerciciosIndividuais.Aula2TT2;

public class Triangulo extends GeometricFigure {

    double base;
    double height;

    public Triangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }
}
