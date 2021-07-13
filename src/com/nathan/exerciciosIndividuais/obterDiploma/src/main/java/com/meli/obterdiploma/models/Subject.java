package com.meli.obterdiploma.models;
import javax.validation.constraints.*;

public class Subject {

    @NotBlank
    @Pattern(regexp = "([a-zA-Z]|( ))*", message = "O nome da disciplina deve ter apenas letras e espacos.")
    @Size(min = 8, max = 64, message = "O nome da disciplina deve ter no minimo oito caracteres e no maximo 64 caracteres.")
    String subject;

    @DecimalMin(value = "0", message = "O valor deve ser superior ou igual a zero.")
    @DecimalMax(value = "10", message = "O valor deve ser inferior ou igual a dez.")
    Double note;

    public Subject(String subject, Double note) {
        this.subject = subject;
        this.note = note;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }
}
