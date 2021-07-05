package com.meli.bootcamp.starwars.dtos;

import lombok.Data;

import java.util.List;

@Data
public class StarWarsDTO {

    List<String> matches;

    public StarWarsDTO(List<String> matches) {
        this.matches = matches;
    }
}
