package com.hillel.junit;

import com.hillel.multi.persistent.entity.Teacher;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class PhoneNumberTest {

    @Test
    public void testPhoneNumberConstraint() {
        Teacher teacher = new Teacher();
        teacher.setPhone(null);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Teacher>> validate = validator.validate(teacher);
        System.out.println(validate);
    }
}
