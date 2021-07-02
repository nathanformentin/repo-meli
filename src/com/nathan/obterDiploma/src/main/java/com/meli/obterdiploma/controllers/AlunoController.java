package com.meli.obterdiploma.controllers;

import com.meli.obterdiploma.dtos.MensagemDTO;
import com.meli.obterdiploma.models.Aluno;
import com.meli.obterdiploma.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<MensagemDTO> obtainDiploma(@RequestBody Aluno aluno) {
        System.out.println(aluno.toString());
        return new ResponseEntity<>(alunoService.imprimeDiploma(aluno), HttpStatus.OK);
    }
}
