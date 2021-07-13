package com.meli.obterdiploma.dtos;

import java.math.BigDecimal;

public class MensagemDTO {

    String nome;
    Double media;
    String mensagem;


    public MensagemDTO(String nome, Double media, String mensagem) {
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

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
