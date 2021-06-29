package com.nathan.exerciciosIndividuais.Aula4.Dakar;
import java.util.ArrayList;
import java.util.List;

public class Corrida {

    double distancia;
    double premioEmDolares;
    String nome;
    int quantidadeVeiculosPermitidos;
    List<Veiculo>veiculosRegistrados = new ArrayList<>();
    SocorristaCarro socorristaCarro = new SocorristaCarro(100, 2, 5, "xxx");
    SocorristaMoto socorristaMoto = new SocorristaMoto(100, 2, 5, "yyy");


    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        Veiculo veiculo = new Carro(velocidade, aceleracao, anguloDeGiro, patente);
        if (veiculosRegistrados.size() < quantidadeVeiculosPermitidos) {
            veiculosRegistrados.add(veiculo);
        }
    }

    public void registrarCarro(Carro carro) {

        System.out.println(veiculosRegistrados);
        if (veiculosRegistrados.size() < quantidadeVeiculosPermitidos) {
            veiculosRegistrados.add(carro);
        }
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        Veiculo veiculo = new Moto(velocidade, aceleracao, anguloDeGiro, patente);
        if (veiculosRegistrados.size() < quantidadeVeiculosPermitidos) {
            veiculosRegistrados.add(veiculo);
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculosRegistrados.remove(veiculo);
    }

    public void removerVeiculo(String placa) {
        Veiculo vehicle = veiculosRegistrados.stream().filter(veiculo -> placa.equals(veiculo.getPlaca())).findFirst().orElse(null);
        if (vehicle != null) {
            removerVeiculo(vehicle);
        } else {
            System.out.println("Veiculo nao encontrado!");
        }
    }

    public void determinaVencedor() {
        if (!veiculosRegistrados.isEmpty()) {
            double maxScore = 0;
            Veiculo vencedor = null;
            for (Veiculo veiculo : veiculosRegistrados) {
                double scoreVeiculo = veiculo.calculaScore();
                if (scoreVeiculo > maxScore) {
                    maxScore = scoreVeiculo;
                    vencedor = veiculo;
                }
                System.out.println("Placa do veiculo vencedor: " + vencedor.getPlaca() + "\n" + "Score: " + maxScore);
            }
        }
    }

    public void socorrerCarro(Carro carro) {
        socorristaCarro.socorrer(carro);
    }

    public void socorrerMoto(Moto moto) {
        socorristaMoto.socorrerMoto(moto);
    }
}
