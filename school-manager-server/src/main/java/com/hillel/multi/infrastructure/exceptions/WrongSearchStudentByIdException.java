package com.hillel.multi.infrastructure.exceptions;

public class WrongSearchStudentByIdException extends RuntimeException {

    public WrongSearchStudentByIdException(String message) {
        super(message);
    }
}
