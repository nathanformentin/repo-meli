package com.nathan.exerciciosIndividuais.Aula4.SaveTheRopaSA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    static int identifier = 0;
    Map<Integer, List<Vestuario>> estoque = new HashMap<>();


    public void incrementIdentifier() {
        identifier++;
    }



    public Integer guardarVestuarios(List<Vestuario> listaDeVestuarios) {
        incrementIdentifier();

        estoque.put(identifier, listaDeVestuarios);
        return identifier;
    }

    public void mostrarVestuarios() {
        estoque.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        return estoque.get(id);
    }

}
