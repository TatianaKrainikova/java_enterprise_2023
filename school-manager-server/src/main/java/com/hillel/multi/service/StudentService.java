package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

    ResponseEntity<Student> getStudentById(int id);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    Student addStudent(Student student);

    void deleteStudentById(int id);
}
