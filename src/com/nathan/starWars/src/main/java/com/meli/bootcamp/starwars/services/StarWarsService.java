package com.meli.bootcamp.starwars.services;

import com.meli.bootcamp.starwars.daos.StarWarsDAO;
import com.meli.bootcamp.starwars.dtos.StarWarsDTO;
import org.springframework.stereotype.Service;

@Service
public class StarWarsService {

    private final StarWarsDAO starwarsDAO;

    public StarWarsService(StarWarsDAO starwarsDAO) {
        this.starwarsDAO = starwarsDAO;
    }

    public StarWarsDTO findCharacters(String name) {
        return new StarWarsDTO(starwarsDAO.searchByName(name));

    }

}
