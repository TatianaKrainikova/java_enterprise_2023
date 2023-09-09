package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.Teacher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api/teachers")
public interface TeacherController {

    @PostMapping("/create")
    public Teacher hireTeacher(Teacher teacher);

    @DeleteMapping("/delete/{id}")
    void fireTeacherById(int id);

    @GetMapping("/get/all")
    List<Teacher> getAllTeachers();

    @GetMapping("get/{id}")
    ResponseEntity<Teacher> getTeacherById(int id);

    @PutMapping("/update/{id}")
    Teacher updateTeacher(Teacher teacher);
}
