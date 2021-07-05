package com.meli.bootcamp.starwars.models;

import lombok.Data;

@Data
public class StarWarChar {
    public String name;
    public Object height;
    public Object mass;
    public String hair_color;
    public String skin_color;
    public String eye_color;
    public String birth_year;
    public String gender;
    public String homeworld;
    public String species;
}
