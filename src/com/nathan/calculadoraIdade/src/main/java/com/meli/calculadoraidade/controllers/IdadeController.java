package com.meli.calculadoraidade.controllers;

import com.meli.calculadoraidade.services.IdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/")
public class IdadeController {

    @Autowired
    IdadeService idadeService;


    @PostMapping("/{day}/{month}/{year}")
    public ResponseEntity<Integer> calculateAge(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        return new ResponseEntity<>(idadeService.calculateAge(year, month, day), HttpStatus.OK);
    }

}
