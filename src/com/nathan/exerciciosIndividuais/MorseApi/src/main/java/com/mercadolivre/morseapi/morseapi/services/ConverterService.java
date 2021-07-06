package com.mercadolivre.morseapi.morseapi.services;

import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    static String[] code
            = { ".-",   "-...", "-.-.", "-..",  ".",
            "..-.", "--.",  "....", "..",   ".---",
            "-.-",  ".-..", "--",   "-.",   "---",
            ".--.", "--.-", ".-.",  "...",  "-",
            "..-",  "...-", ".--",  "-..-", "-.--",
            "--..", "|" };

    public static char get(String letter) {
        for (int i = 0; i < code.length; i++) {
            if (code[i].equals(letter)) {
                return (char) (i + 'a');
            }
        }
        return '1';
    }

    public static String convert(String morseCode) {
        StringBuilder result = new StringBuilder();
        for(String word : morseCode.trim().split("   ")) {
            for(String letter : word.split("\\s+")) {
                result.append(get(letter));
            }
            result.append(' ');
        }
        return result.toString().trim();
    }

        }
