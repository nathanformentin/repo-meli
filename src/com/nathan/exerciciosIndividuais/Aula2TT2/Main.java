package com.nathan.exerciciosIndividuais.Aula2TT2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        GeometricFigure circle = new Circulo(1d);
        System.out.println(circle.area());
        GeometricFigure rectangle = new Retangulo(1, 1);
        System.out.println(rectangle.area());
        GeometricFigure triangle = new Triangulo(2,2);
        System.out.println(triangle.area());

        GeometricFigure[] arr = new GeometricFigure[3];
        arr[0] = circle;
        arr[1] = rectangle;
        arr[2] = triangle;

        System.out.println(areaMedia(arr));
    }

    public static double areaMedia(GeometricFigure[] arr) {
        double sum = Arrays.stream(arr).map(GeometricFigure::area).reduce(0.0, Double::sum);
        return sum / arr.length;
    }
}
