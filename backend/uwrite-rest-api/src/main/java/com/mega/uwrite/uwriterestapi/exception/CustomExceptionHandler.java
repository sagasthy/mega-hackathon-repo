package com.mega.uwrite.uwriterestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = { UserNotFoundException.class, StoryNotFoundException.class })
    protected ResponseEntity<ErrorResponse> handleException (
            RuntimeException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse("NOT_FOUND", ex.getMessage(), LocalDateTime.now().toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = { LoginFailureException.class})
    protected ResponseEntity<ErrorResponse> handleLoginException (
            RuntimeException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse("UNAUTHORIZED", ex.getMessage(), LocalDateTime.now().toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
    }
}

record ErrorResponse (String errorCode, String errorDescription, String time) {}