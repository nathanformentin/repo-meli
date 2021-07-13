package com.meli.obterdiploma.models;
import java.util.ArrayList;
import java.util.List;

public class Aluno {


    String nome;
    List<Subject> notas = new ArrayList<>();

    public Aluno(String name, List<Subject> subjects) {
        this.nome = nome;
        this.notas = subjects;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", notas=" + notas +
                '}';
    }

    public List<Subject> getNotas() {
        return notas;
    }

    public void setNotas(List<Subject> notas) {
        this.notas = notas;
    }
}
