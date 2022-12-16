package com.skypro.exception;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

}
