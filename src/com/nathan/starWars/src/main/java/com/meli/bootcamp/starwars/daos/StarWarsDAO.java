package com.meli.bootcamp.starwars.daos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.bootcamp.starwars.models.StarWarChar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StarWarsDAO {

    private final String FILE_PATH = "src/main/java/com/meli/bootcamp/starwars/resources/starwars.json";
    private final File file = new File(FILE_PATH);
    private final ObjectMapper mapper = new ObjectMapper();

    List<StarWarChar> characters;

    @Autowired
    public StarWarsDAO() {
        this.characters = readJson();
    }



    public List<String> searchByName(String nameToSearch) {
        List<String> matches = new ArrayList<>();
        for (StarWarChar character : characters) {
            String currentName = character.getName();
            if (currentName.contains(nameToSearch)) {
                System.out.println(currentName);
                matches.add(currentName);
            }
        }
        return matches;
    }


    private List<StarWarChar> readJson()  {
        List<StarWarChar> listOfCharacters = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream(file);
            TypeReference<List<StarWarChar>> typeReference = new TypeReference<>() {};

            listOfCharacters = mapper.readValue(inputStream, typeReference);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfCharacters;
    }
}
