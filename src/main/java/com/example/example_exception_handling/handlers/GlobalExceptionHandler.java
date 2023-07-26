package com.example.example_exception_handling.handlers;

import com.example.example_exception_handling.exception.NoSuchCustomerExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value
            = NoSuchCustomerExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleException(NoSuchCustomerExistsException ex) {
        return new ErrorResponse(
                HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }
    @ExceptionHandler(value
            = MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ErrorResponse handleExceptionMethod(MethodArgumentNotValidException ex) {
        return new ErrorResponse(
                HttpStatus.NOT_ACCEPTABLE.value(), ex.getMessage());
    }

}
