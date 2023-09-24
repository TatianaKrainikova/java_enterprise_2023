package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.Teacher;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class TeacherServiceImpl implements TeacherService {

    @Override
    public Teacher hireTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public void fireTeacherById(int id) {

    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }

    @Override
    public ResponseEntity<Teacher> getTeacherById(int id) {
        return null;
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return null;
    }

    public void validateTeacher(@Valid Teacher teacher) {
        System.out.println("Validated");
    }
}
