package com.hillel.multi.service.validation.annotation;

import com.hillel.multi.service.validation.validator.PhoneNumberValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = {PhoneNumberValidator.class})
@Target( { ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD,
        ElementType.ANNOTATION_TYPE, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumberConstraint {

    String message() default "Problem! Invalid phone number!";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
