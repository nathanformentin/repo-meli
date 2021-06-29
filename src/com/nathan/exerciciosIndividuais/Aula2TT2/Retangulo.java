package com.nathan.exerciciosIndividuais.Aula2TT2;

public class Retangulo extends GeometricFigure {

    double aresta1;
    double aresta2;

    public Retangulo(double aresta1, double aresta2) {
        this.aresta1 = aresta1;
        this.aresta2 = aresta2;
    }

    @Override
    public double area() {
        return aresta1 * aresta2;
    }
}
