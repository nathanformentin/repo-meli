package com.meli.obterdiploma.exception.handler;

import com.meli.obterdiploma.dtos.ErrorMessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Objects;

@ControllerAdvice
public class ApiExceptionControllerAdvice extends Exception {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ErrorMessageDTO> invalidArgumentHandler(MethodArgumentNotValidException e) {
        return ResponseEntity.badRequest().body(new ErrorMessageDTO(HttpStatus.BAD_REQUEST.value(), Objects.requireNonNull(e.getFieldError()), e.getFieldError().getDefaultMessage()));
    }

}
