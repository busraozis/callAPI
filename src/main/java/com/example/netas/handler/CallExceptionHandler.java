package com.example.netas.handler;

import com.example.netas.exception.InvalidFieldException;
import com.example.netas.exception.MissingRequestParameterException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CallExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(MissingRequestParameterException.class)
    @ResponseBody
    public ResponseEntity<Object> handleMissingRequestParameterException(MissingRequestParameterException ex) {
        return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidFieldException.class)
    @ResponseBody
    public ResponseEntity<Object> handleInvalidFieldException(InvalidFieldException ex) {
        return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
