package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api/course")
public interface CourseController {

    @PostMapping("/create")
    Course createCourse(Course course);

    @DeleteMapping("/delete/{id}")
    void deleteCourseById(int id);

    @PutMapping("/update/{id}")
    Course updateCourse(Course course);

    @GetMapping("/get/all")
    List<Course> getAllCourses();

    @GetMapping("get/{id}")
    ResponseEntity<Course> getCourseById(int id);
}
