package com.mercadolivre.morseapi.morseapi.controllers;
import com.mercadolivre.morseapi.morseapi.services.ConverterService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/converter")
public class decodeMorse {

    @PostMapping("/morse/")
    public String morse(HttpServletRequest request) {
        return ConverterService.convert(request.getParameter("morse"));
    }
}
