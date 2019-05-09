package com.springboot.apirest.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RutConstraintValidator implements ConstraintValidator<ValidRut, String> {

    @Override
    public void initialize(ValidRut constraintAnnotation) {
        // No initialization

    }

    @Override
    public boolean isValid(String rut, ConstraintValidatorContext context) {

        return RutValidator.isValid(rut);

    }

}