package com.DnDA.exceptions;

public class PlayerDoesntBelongInThisRoomException extends RuntimeException{
    public PlayerDoesntBelongInThisRoomException() {
    }

    public PlayerDoesntBelongInThisRoomException(String message) {
        super(message);
    }

    public PlayerDoesntBelongInThisRoomException(String message, Throwable cause) {
        super(message, cause);
    }
}
