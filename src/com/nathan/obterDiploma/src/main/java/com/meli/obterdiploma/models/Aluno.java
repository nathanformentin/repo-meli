package com.meli.obterdiploma.models;

import java.util.Map;

public class Aluno {

    String nome;
    Map<String, Double> notas;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", notas=" + notas +
                '}';
    }

    public Map<String, Double> getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(Map<String, Double> notas) {
        this.notas = notas;
    }
}
