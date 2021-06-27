package com.nathan.exerciciosIndividuais.Aula1TT1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class radixSort {

    public static void main(String[] args) {
        List<Integer> array;
        array = fillArray();
        var stringArray = convertToStringArray(array);

        int maxNumberOfDigits = getMaxNumberOfDigits(stringArray);
        var paddedStringArray = new ArrayList<String>();
        for (String s : stringArray) {
            paddedStringArray.add(addPadding(s, maxNumberOfDigits));
        }

        List<String> sortedArray = new ArrayList<>(paddedStringArray);
        System.out.println("Lista digitada: " + sortedArray);
        int numberOfLists = 10; //possible digits 0-9
        for (int i = maxNumberOfDigits - 1; i >= 0; i--) {
            List<List<String>> buckets = generateListOfLists(numberOfLists);
            for (String s : sortedArray) {
                int currentDigit = Character.getNumericValue(s.charAt(i));
                List<String> digitBucket = buckets.get(currentDigit);
                digitBucket.add(s);
            }

            System.out.println("antes de zerar"+ sortedArray);

            sortedArray = new ArrayList<>();
            for (List<String> bucket : buckets) {
                sortedArray.addAll(bucket);
            }
        }

        array = convertToIntegerArray(sortedArray);
        System.out.println("Lista ordenada: "+ array);


    }

    static List<Integer> fillArray() {
        List<Integer> array = new ArrayList<>();
        var scanner = new Scanner(System.in);
        System.out.println("Quantos valores deseja inserir?");
        int n = scanner.nextInt();
        int value;
        for (int i = 0; i < n; i++) {
            value = scanner.nextInt();
            array.add(value);
        }

        return array;
    }

    static List<String> convertToStringArray(List<Integer> array) {
        var stringArray = new ArrayList<String>();
        for(Integer i : array) {
            stringArray.add(String.valueOf(i));
        }

        return stringArray;
    }

    static List<Integer> convertToIntegerArray(List<String> array) {
        var integerArray = new ArrayList<Integer>();
        for(String s : array) {
            integerArray.add(parseInt(s));
        }

        return integerArray;
    }

    static String addPadding(String value, int numberOfZeroes) {
        return String.format("%1$" + numberOfZeroes + "s", value).replace(' ', '0');
    }

    static int getMaxNumberOfDigits(List<String> array) {
        int maxNumberOfDigits = 0;
        for (String number : array) {
            if (number.length() > maxNumberOfDigits) {
                maxNumberOfDigits = number.length();
            }
        }

        return maxNumberOfDigits;
    }

    static List<List<String>> generateListOfLists(int numberOfLists) {
        List<List<String>> baseList = new ArrayList<>();
        for (int i = 0; i < numberOfLists; i++) {
            baseList.add(new ArrayList<>());
        }
        return baseList;
    }

}
