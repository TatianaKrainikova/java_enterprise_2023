package com.hillel.multi.service.validation.validator;

import com.hillel.multi.service.validation.annotation.PhoneNumberConstraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraintvalidation.SupportedValidationTarget;
import jakarta.validation.constraintvalidation.ValidationTarget;

@SupportedValidationTarget({ValidationTarget.ANNOTATED_ELEMENT})
public class PhoneNumberValidator implements
        ConstraintValidator<PhoneNumberConstraint, String> {

    @Override
    public void initialize(PhoneNumberConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String numberField, ConstraintValidatorContext constraintValidatorContext) {

        return numberField != null && numberField.matches("[0-9]+")
                && (numberField.length() > 8 && (numberField.length() < 14));
    }
}
