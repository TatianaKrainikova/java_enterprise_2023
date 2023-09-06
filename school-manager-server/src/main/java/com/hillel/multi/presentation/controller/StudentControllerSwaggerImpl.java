package com.hillel.multi.presentation.controller;

import com.hillel.api.SchoolManagerApi;
import com.hillel.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerSwaggerImpl implements SchoolManagerApi {

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
}
