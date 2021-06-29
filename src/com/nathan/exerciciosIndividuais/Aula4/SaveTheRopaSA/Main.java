package com.nathan.exerciciosIndividuais.Aula4.SaveTheRopaSA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vestuario roupa1 = new Vestuario("generics", "generics1");
        Vestuario roupa2 = new Vestuario("billabong", "camiseta");
        List<Vestuario> conjunto = new ArrayList<>();
        conjunto.add(roupa1);
        conjunto.add(roupa2);
        GuardaRoupa gr = new GuardaRoupa();
        gr.guardarVestuarios(conjunto);
        System.out.println("X");
        gr.mostrarVestuarios();
        System.out.println(gr.devolverVestuarios(1).toString());
    }
}
