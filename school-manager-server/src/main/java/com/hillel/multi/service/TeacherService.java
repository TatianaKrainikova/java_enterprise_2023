package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.Teacher;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TeacherService {

    Teacher hireTeacher(Teacher teacher);

    void fireTeacherById(int id);

    List<Teacher> getAllTeachers();

    ResponseEntity<Teacher> getTeacherById(int id);

    Teacher updateTeacher(Teacher teacher);
}
