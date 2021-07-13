package com.meli.obterdiploma.dtos;

import java.math.BigDecimal;
import java.util.Objects;

public class analiseAlunoDTO {

    String message;
    Double average;
    AlunoDTO student;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public AlunoDTO getStudent() {
        return student;
    }

    public void setStudent(AlunoDTO student) {
        this.student = student;
    }

    public analiseAlunoDTO(Double average, AlunoDTO alunoDTO) {
        this.message = "Sua média foi de " + average;
        this.average = average;
        this.student = alunoDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        analiseAlunoDTO that = (analiseAlunoDTO) o;
        return Objects.equals(message, that.message) && Objects.equals(average, that.average) && Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, average, student);
    }
}
