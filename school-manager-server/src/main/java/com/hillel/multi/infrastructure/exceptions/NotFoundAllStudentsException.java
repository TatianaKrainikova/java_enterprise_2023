package com.hillel.multi.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Custom exception; using as an example in StudentsServiceImpl
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Students was not found!")
public class NotFoundAllStudentsException extends RuntimeException {

    public NotFoundAllStudentsException() {
        super();
    }
}
