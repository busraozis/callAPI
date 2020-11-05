package com.example.netas.handler;

import com.example.netas.exception.InvalidFieldException;
import com.example.netas.exception.MissingRequestParameterException;
import com.example.netas.model.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CallExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(MissingRequestParameterException.class)
    public ResponseEntity<Object> handleMissingRequestParameterException(MissingRequestParameterException ex) {
        String error = "Request parameter is missing.";
        return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, ex));
    }

    @ExceptionHandler(InvalidFieldException.class)
    public ResponseEntity<Object> handleInvalidFieldException(InvalidFieldException ex) {
        String error = "Call Type is not valid.";
        return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, ex));
    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

}
