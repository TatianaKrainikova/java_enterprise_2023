package com.hillel.multi.infrastructure.exceptions;

import com.hillel.multi.presentation.model.ProblemDetails;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentControllerAdviceHandler {

    @ExceptionHandler(SchoolManagerGeneralException.class)
    public ResponseEntity handleGeneralException(SchoolManagerGeneralException exception) {

        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.setDescription("Something went wrong!");
        problemDetails.setErrorType("General problem");
        problemDetails.setRootCause("Application is broken");
        problemDetails.setExceptionMessage(exception.getMessage());

        return new ResponseEntity<>(problemDetails, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
