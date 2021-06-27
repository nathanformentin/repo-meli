package com.nathan.exerciciosIndividuais.Aula1TM21;

import java.util.Arrays;
import java.util.Scanner;

public class Aula1TM21 {

    public static void main(String[] args) {
        Integer[] array = new Integer[3];
        array = fillArray(array.length);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Decrescente: ");
        showArray(true, array);
        System.out.println("Crescente: ");
        showArray(false, array);
    }

    static Integer[] fillArray(int arraySize) {
        Integer[] array = new Integer[arraySize];
        var scanner = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static void showArray(boolean crescente, Integer[] array) {
        int begin = 0;
        int end = array.length - 1;
        if (crescente) {
            for (int i = end; i >= begin; i--) {
                System.out.println(i + " valor: " + array[i]);
            }
        } else {
            for(int i = begin; i <= end; i++) {
                System.out.println(i + " valor: " + array[i]);
            }
        }





    }
}
