package com.nathan.exerciciosIndividuais.Aula2TT1;

public class SenhaForte extends Senha {

    public SenhaForte() {
        this.regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";;
    }
    // Minimum eight and maximum 10 characters, at least one uppercase letter, one lowercase letter, one number and one special character:
}
