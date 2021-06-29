package com.nathan.exerciciosIndividuais.Aula2TT1;

public class SenhaMedia extends Senha {

    public SenhaMedia() {
        this.regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
    }
}
