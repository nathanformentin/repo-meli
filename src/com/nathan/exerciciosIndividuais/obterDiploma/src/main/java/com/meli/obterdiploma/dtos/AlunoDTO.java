package com.meli.obterdiploma.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.meli.obterdiploma.models.Aluno;
import com.meli.obterdiploma.models.Subject;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class AlunoDTO {

    @NotBlank(message = "O nome nao deve ser vazio!")
    @Pattern(regexp = "([a-zA-Z]|( ))*", message = "Ha caracteres invalidos no nome do aluno.")
    @Size(min = 8, max = 64, message = "O nome deve ter entre 8 e 64 caracteres.")
    String nome;
    @JsonAlias("subjects")
    @Valid
    List<Subject> notas;

    public AlunoDTO(String name, List<Subject> notas) {
        this.nome = name;
        this.notas = notas;
    }

    public AlunoDTO() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Subject> getNotas() {
        return notas;
    }

    public void setNotas(List<Subject> notas) {
        this.notas = notas;
    }

    public Aluno convert() {
        return new Aluno(this.nome, this.notas);
    }
}
