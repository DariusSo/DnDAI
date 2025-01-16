package com.DnDA.exceptions;

public class PlayerAlreadyExistsException extends RuntimeException{

    public PlayerAlreadyExistsException() {
    }

    public PlayerAlreadyExistsException(String message) {
        super(message);
    }

    public PlayerAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
