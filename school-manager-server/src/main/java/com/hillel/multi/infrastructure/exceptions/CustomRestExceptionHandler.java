package com.hillel.multi.infrastructure.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {IllegalArgumentException.class, IllegalStateException.class})
    public ResponseEntity<Object> handleProblem(RuntimeException exception, WebRequest request) {
        String bodyOfResponse = "Problem! Not supported..";
        return handleExceptionInternal(exception, bodyOfResponse, new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
}
