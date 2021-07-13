package com.meli.obterdiploma.dtos;

import org.springframework.validation.FieldError;

public class ErrorMessageDTO {

    private int statusCode;
    private String field;
    private String message;

    public ErrorMessageDTO(int statusCode, FieldError fieldError, String message) {
        this.statusCode = statusCode;
        this.field = fieldError.getField();
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
