package com.nathan.exerciciosIndividuais.Aula1TM22;

public class Aula1TM22 {

    public static void main(String[] args) {
        double companyXEvaluation = 1.13;
        double companyXGrowth = 1.48;
        double companyYEvaluation = 18.4;
        double companyYGrowth = 0.32;
        int year = 2021;
        boolean xSmallerThanY = false;

        while(companyXEvaluation < companyYEvaluation) {
            companyXEvaluation += companyXEvaluation * companyXGrowth;
            companyYEvaluation += companyYEvaluation * companyYGrowth;
            year++;
            System.out.println("Empresa Y em 01/01/" + year + " - Valor da empresa: " + companyYEvaluation);
            System.out.println("Empresa X em 01/01/" + year + " - Valor da empresa: " + companyXEvaluation);
        }
    }
}
