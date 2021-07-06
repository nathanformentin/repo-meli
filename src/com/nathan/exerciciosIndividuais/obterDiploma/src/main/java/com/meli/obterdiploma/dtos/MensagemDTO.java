package com.meli.obterdiploma.dtos;

public class MensagemDTO {

    String nome;
    double media;
    String mensagem;


    public MensagemDTO(String nome, double media, String mensagem) {
        this.nome = nome;
        this.mensagem = mensagem;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
