package com.meli.calculadoraidade.services;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class IdadeService {

    public int calculateAge(int year, int month, int day) {
        int age = LocalDate.now().
                minus(Period.of(year, month, day)).
                getYear();
        if (age >= 0) {
            return age;
        } else {
            throw new IllegalArgumentException("Essa idade é no futuro.");
        }

    }
}
