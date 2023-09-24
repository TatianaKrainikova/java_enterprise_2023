package com.hillel.junit;

import com.hillel.multi.persistent.entity.Student;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class PhoneNumberTest {

    @Test
    public void testPhoneNumberConstraint() {
        Student student = new Student();
        student.setPhone(null);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.usingContext().getValidator();
        Set<ConstraintViolation<Student>> validate = validator.validate(student);
        System.out.println(validate);
    }
}
