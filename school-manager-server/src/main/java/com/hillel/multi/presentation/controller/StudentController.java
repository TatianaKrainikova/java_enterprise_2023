package com.hillel.multi.presentation.controller;

import com.hillel.multi.infrastructure.exceptions.SchoolManagerGeneralException;
import com.hillel.multi.infrastructure.exceptions.WrongSearchStudentByIdException;
import com.hillel.multi.presentation.model.ProblemDetails;
import com.hillel.multi.persistent.entity.Student;

import com.hillel.multi.service.StudentsServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/students")
@Validated
public class StudentController {

    @Autowired
    StudentsServiceImpl studentsService;

    // Example of handling exception in controller using custom exception(WrongSearchStudentByIdException)
    @ExceptionHandler(WrongSearchStudentByIdException.class)
    public ResponseEntity handleSearchStudentError(WrongSearchStudentByIdException exception) {
        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.setDescription("You use wrong type for searching student by id");
        problemDetails.setErrorType("Type input problem");
        problemDetails.setRootCause("Wrong input");
        problemDetails.setExceptionMessage(exception.getMessage());

        return new ResponseEntity<>(problemDetails, new HttpHeaders(), HttpStatus.CONFLICT);
    }

    @GetMapping("/get/all")
    public @ResponseBody List<Student> getAllStudents() {
        return studentsService.getAllStudents();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/get/{id}",
            produces = {"application/json"}
    )
    public ResponseEntity<Student> getStudentById(@PathVariable("id") int id,
                                                   @RequestParam(value = "verbosity",
                                                   required = false,
                                                   defaultValue = "all") String verbosity) {
        return studentsService.getStudentById(id);
    }

    @PutMapping(value = "/put/{id}")
    public Student updateStudent(@PathVariable int id,
                                 @RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, required = false) String language,
                                 @RequestHeader Map<String, String> headers,
                                 @RequestBody Student student) {
        return studentsService.updateStudent(student);
    }

    @PostMapping("/add")
    public Student addStudent(@Valid @RequestBody(required = false) Student student) {
        return studentsService.addStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable("id") int id) {
        studentsService.deleteStudentById(id);
    }


    @GetMapping(value = "/problem/{id}")
    public ResponseEntity<String> findProblem(@PathVariable String id) {

        if (id.equals("one")) {
            throw new WrongSearchStudentByIdException("You are using the wrong type to search for a student by ID");
        }
        if (id.equals("conflict")) {
            throw new SchoolManagerGeneralException("Application doesn't work! Incorrect execution");
        }
        return ResponseEntity.ok("Need a plan to solve the problem");
    }
}