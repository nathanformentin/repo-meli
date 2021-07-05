package com.meli.bootcamp.starwars.controllers;

import com.meli.bootcamp.starwars.dtos.StarWarsDTO;
import com.meli.bootcamp.starwars.services.StarWarsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StarWarsController {

    final StarWarsService starWarsService;

    public StarWarsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }


    @GetMapping("/chars")
    public ResponseEntity<StarWarsDTO> getCharacters(@RequestParam String name) {
        return new ResponseEntity<>(starWarsService.findCharacters(name), HttpStatus.OK);
    }
}
