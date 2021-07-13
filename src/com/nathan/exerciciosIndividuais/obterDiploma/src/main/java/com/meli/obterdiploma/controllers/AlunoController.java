package com.meli.obterdiploma.controllers;

import com.meli.obterdiploma.dtos.AlunoDTO;
import com.meli.obterdiploma.dtos.analiseAlunoDTO;
import com.meli.obterdiploma.dtos.MensagemDTO;
import com.meli.obterdiploma.services.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController("/")
public class AlunoController {

    final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public ResponseEntity<MensagemDTO> obtainDiploma(@RequestBody AlunoDTO aluno) {
        System.out.println(aluno.toString());
        return new ResponseEntity<>(alunoService.imprimeDiploma(aluno), HttpStatus.OK);
    }

    @PostMapping("/analyzeNotes")
    public ResponseEntity<analiseAlunoDTO> obtainCustomDiploma(@RequestBody @Valid AlunoDTO aluno) {

        return new ResponseEntity<>(alunoService.imprimeAnaliseDiploma(aluno), HttpStatus.CREATED);

    }
}
