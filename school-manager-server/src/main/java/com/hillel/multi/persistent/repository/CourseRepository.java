package com.hillel.multi.persistent.repository;

import com.hillel.multi.persistent.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
