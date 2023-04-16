package com.mega.uwrite.uwriterestapi.exception;

public class LoginFailureException extends RuntimeException{
    public LoginFailureException(String message) {
        super(message);
    }
}
