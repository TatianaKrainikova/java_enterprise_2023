package com.hillel.multi.springBootTest;

import com.hillel.multi.persistent.entity.Teacher;

import com.hillel.multi.service.TeacherServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NumberSpringBootTest {

    @Autowired
    TeacherServiceImpl teacherService;

    @Test
    public void testNumber() {
        Teacher teacher = new Teacher();
        teacher.setPhone("66666666666444444444444");

        teacherService.validateTeacher(teacher);
    }
}
