package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.Course;
import com.hillel.multi.persistent.entity.Group;
import com.hillel.multi.persistent.entity.Student;
import com.hillel.multi.persistent.entity.Teacher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api/group")
public interface GroupController {

    @PostMapping("/create")
    Group createGroup(Group group);

    @DeleteMapping("/delete/{id}")
    void deleteGroupById(int id);

    @PutMapping("/add/students")
    Group addStudents(List<Student> students);

    @PutMapping("/add/teacher")
    Group addTeacher(Teacher teacher);

    @PutMapping("/add/course")
    Group addCourse(Course course);

    @GetMapping("get/{id}")
    ResponseEntity<Group> getGroupById(int id);
}
