package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.Course;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CourseService {

    Course createCourse(Course course);

    void deleteCourseById(int id);

    Course updateCourse(Course course);

    List<Course> getAllCourses();

    ResponseEntity<Course> getCourseById(int id);
}
