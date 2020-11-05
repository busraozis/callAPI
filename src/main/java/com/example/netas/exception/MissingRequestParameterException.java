package com.example.netas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MissingRequestParameterException extends RuntimeException{
    public MissingRequestParameterException(String exception) {
        super(exception);
    }
}
