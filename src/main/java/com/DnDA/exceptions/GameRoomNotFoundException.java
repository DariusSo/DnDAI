package com.DnDA.exceptions;

public class GameRoomNotFoundException extends RuntimeException{
    public GameRoomNotFoundException() {
    }

    public GameRoomNotFoundException(String message) {
        super(message);
    }

    public GameRoomNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
