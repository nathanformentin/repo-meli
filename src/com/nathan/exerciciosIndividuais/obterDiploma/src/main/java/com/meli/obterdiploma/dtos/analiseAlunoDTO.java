package com.meli.obterdiploma.dtos;

import java.math.BigDecimal;

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



}
