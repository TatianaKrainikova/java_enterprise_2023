package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.Course;
import com.hillel.multi.persistent.entity.Group;
import com.hillel.multi.persistent.entity.Student;
import com.hillel.multi.persistent.entity.Teacher;
import org.springframework.http.ResponseEntity;

import java.util.Set;

public interface GroupService {

    Group createGroup(Group group);

    void deleteGroupById(int id);

    Group addStudents(Set<Student> students);

    Group addTeacher(Teacher teacher);

    Group addCourse(Course course);

    ResponseEntity<Group> getGroupById(int id);
}
