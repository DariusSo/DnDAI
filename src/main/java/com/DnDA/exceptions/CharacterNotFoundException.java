package com.DnDA.exceptions;

public class CharacterNotFoundException extends RuntimeException{
    public CharacterNotFoundException() {
    }

    public CharacterNotFoundException(String message) {
        super(message);
    }

    public CharacterNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
