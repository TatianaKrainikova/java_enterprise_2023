package com.hillel.multi.springBootTest;

import com.hillel.multi.persistent.entity.Teacher;
import com.hillel.multi.service.TeacherServiceImpl;
import jakarta.validation.ConstraintViolationException;
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
        teacher.setPhone(null);

        try {
            teacherService.validateTeacher(teacher);
        } catch (ConstraintViolationException exception) {
            System.out.println("Invalid data");
        }
    }
}