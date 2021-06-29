package com.nathan.exerciciosIndividuais.Aula2TT1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class Senha {
    String code;
    String regex;

    public void setValue(String password) {
        if (isValidPassword(password)) {
            this.code = password;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("A senha é inválida!");
        }
    }

    private boolean isValidPassword(String password)
    {
        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        } catch(PatternSyntaxException e) {
            System.out.println("There was a syntax error trying to match the password.");
            return false;
        }
    }
}
