package com.nathan.exerciciosIndividuais.Aula2TT2;

public abstract class GeometricFigure {

    public abstract double area();

    @Override
    public String toString() {
        return "A area da forma geometrica: " + area();
    }
}
