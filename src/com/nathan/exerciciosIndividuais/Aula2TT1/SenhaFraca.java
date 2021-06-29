package com.nathan.exerciciosIndividuais.Aula2TT1;

public class SenhaFraca extends Senha {

    public SenhaFraca() {
        this.regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
    }
    //Minimum eight characters, at least one letter and one number:
}
