package com.hillel.multi.service.validation.annotation;

import com.hillel.multi.service.validation.validator.PhoneNumberValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Constraint(validatedBy = PhoneNumberValidator.class)
@Target( {METHOD, CONSTRUCTOR, FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PhoneNumberConstraint {

    String message() default "Problem! Invalid phone number!";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
