package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.Student;
import com.hillel.multi.service.StudentsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/students")
@Validated
public class StudentController {

    @Autowired
    StudentsService studentsService;

    @GetMapping("/all")
    public @ResponseBody List<Student> getAllStudents() {
        return studentsService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentsById(@PathVariable("id") int id,
                                                   @RequestParam(value = "test",
                                                   required = false,
                                                   defaultValue = "all") String test) {
        return studentsService.getStudentById(id);
    }

    @PostMapping("/add")
    public Student addStudent(@Valid @RequestBody(required = false) Student student) {
        return studentsService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") int id) {
        studentsService.deleteStudentById(id);
    }
}