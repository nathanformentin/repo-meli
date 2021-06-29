package com.nathan.exerciciosIndividuais.Aula2TT1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Forte:");
        Senha forte = new SenhaForte();
        forte.setValue("Oit0l3tr@s");
        forte.setValue("1");
        System.out.println("Media:");
        Senha media = new SenhaMedia();
        media.setValue("1234Up@12345678");
        media.setValue("1");
        System.out.println("Fraca:");
        Senha fraca = new SenhaFraca();
        fraca.setValue("oitoletras12");
        fraca.setValue("1");

    }
}
