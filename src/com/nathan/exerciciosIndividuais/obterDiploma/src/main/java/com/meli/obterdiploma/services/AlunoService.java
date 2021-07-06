package com.meli.obterdiploma.services;

import com.meli.obterdiploma.dtos.MensagemDTO;
import com.meli.obterdiploma.models.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    public MensagemDTO imprimeDiploma(Aluno aluno) {
        double media = calculaMedia(aluno);
        boolean isHonors =  honors(media);
        if (isHonors) {
            return new MensagemDTO(aluno.getNome(), media, "Parabéns por ser um dos melhores da turma! Seu diploma foi gerado!");
        } else {
            return new MensagemDTO(aluno.getNome(), media, "Seu diploma foi gerado.");
        }
    }

    public double calculaMedia(Aluno aluno) {
        List<Double> notas = new ArrayList<>(aluno.getNotas().values());
        return notas.stream().mapToDouble(d -> d).average().orElse(-1);
    }

    public boolean honors(double media) {
        return (media >= 9.0);

    }
}
