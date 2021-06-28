package com.nathan.exerciciosIndividuais.aula3TT;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Arma arco = new Arco("Composto", true, 30d);
        Arma espada = new Espada("Longa", false, 70d);
        Arma cajado = new Cajado("fogo", false, 50d);

        Classe mago = new Mago(30);
        Classe arqueiro = new Arqueiro(25);
        Classe cavaleiro = new Cavaleiro(50);

        Character jorge = new Character("Jorge", mago, 1, cajado);
        Character manoel = new Character("manoel", cavaleiro, 1, espada);
        Character sergio = new Character("sergio", arqueiro, 1, arco);

        jorge.setArma(new Arco("Simples", false, 150));
        manoel.setArma(new Cajado("Gelo", true, 70d));
        sergio.setArma(new Espada("Fogo", false, 70d));
        List<String> weaponList = new ArrayList<>();
        weaponList.add(jorge.getArma());
        weaponList.add(manoel.getArma());
        weaponList.add(sergio.getArma());
        for (String arma : weaponList) {
            System.out.println(arma);
        }

        weaponList.sort(null);
        System.out.println(weaponList);
        for (String arma : weaponList) {
            System.out.println(arma);
        }
    }
}
