package com.hillel.multi.presentation.controller;


import com.hillel.api.SchoolManagerApi;
import com.hillel.model.Student;
import com.hillel.multi.service.StudentsService;
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
public class StudentController implements SchoolManagerApi {

    @Autowired
    StudentsService studentsService;

    @Override
    public ResponseEntity<Student> getStudentById(String id, String verbosity) {
        return SchoolManagerApi.super.getStudentById(id, verbosity);
    }

    @Override
    public ResponseEntity<Student> postStudent(Student student) {
        return SchoolManagerApi.super.postStudent(student);
    }

    @Override
    public ResponseEntity<Student> putStudent(String id, Student student, String language) {
        return SchoolManagerApi.super.putStudent(id, student, language);
    }


//    @GetMapping("/all")
//    public @ResponseBody List<Student> getAllStudents() {
//        return studentsService.getAllStudents();
//    }
//
//    @RequestMapping(
//            method = RequestMethod.GET,
//            value = "/{id}",
//            produces = {"application/json"}
//    )
//    public ResponseEntity<Student> getStudentById(@PathVariable("id") int id,
//                                                   @RequestParam(value = "verbosity",
//                                                   required = false,
//                                                   defaultValue = "all") String verbosity) {
//        return studentsService.getStudentById(id);
//    }
//
//    @PutMapping(value = "/{id}")
//    public Student updateStudent(@PathVariable int id,
//                                 @RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, required = false) String language,
//                                 @RequestHeader Map<String, String> headers,
//                                 @RequestBody Student student) {
//        return studentsService.updateStudent(student);
//    }
//
//    @PostMapping("/add")
//    public Student addStudent(@Valid @RequestBody(required = false) Student student) {
//        return studentsService.addStudent(student);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudentById(@PathVariable("id") int id) {
//        studentsService.deleteStudentById(id);
//    }
}