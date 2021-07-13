package com.meli.obterdiploma.services;

import com.meli.obterdiploma.dtos.AlunoDTO;
import com.meli.obterdiploma.dtos.analiseAlunoDTO;
import com.meli.obterdiploma.dtos.MensagemDTO;
import com.meli.obterdiploma.models.Aluno;
import org.springframework.stereotype.Service;

import javax.validation.Valid;


@Service
public class AlunoService {

    public MensagemDTO imprimeDiploma(AlunoDTO aluno) {
        Double media = calculaMedia(aluno);
        boolean isHonors =  honors(media);
        if (isHonors) {
            return new MensagemDTO(aluno.getNome(), media, "Parabéns por ser um dos melhores da turma! Seu diploma foi gerado!");
        } else {
            return new MensagemDTO(aluno.getNome(), media, "Seu diploma foi gerado.");
        }
    }

    public analiseAlunoDTO imprimeAnaliseDiploma(@Valid AlunoDTO aluno) {
        Double media = calculaMedia(aluno);
        return new analiseAlunoDTO(media, aluno);
    }

    public Double calculaMedia(@Valid AlunoDTO aluno) {
        var notas = aluno.getNotas();
        return notas.stream()
                .mapToDouble(p -> p.getNote())
                .average()
                .orElse(0);
    }

    public boolean honors(Double media) {
        return media >= 9;

    }
}
