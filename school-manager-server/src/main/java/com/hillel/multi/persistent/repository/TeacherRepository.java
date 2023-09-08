package com.hillel.multi.persistent.repository;

import com.hillel.multi.persistent.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
