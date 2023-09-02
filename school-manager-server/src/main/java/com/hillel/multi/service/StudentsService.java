package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.Student;
import com.hillel.multi.persistent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {

    @Autowired
    StudentRepository studentRepository;

    public ResponseEntity<Student> getStudentById(int id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.map(value ->
                ResponseEntity.ok().body(value)).orElseGet(() ->
                ResponseEntity.notFound().build());
    }

    public List<Student> getAllStudents() {
        return new ArrayList<Student>((Collection<? extends Student>) studentRepository.findAll());
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }
}
