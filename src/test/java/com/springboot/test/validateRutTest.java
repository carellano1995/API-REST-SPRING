
package com.springboot.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.springboot.apirest.validations.RutValidator;

import org.junit.Test;

public class validateRutTest {

    @Test
    public void validateRut() {
        assertTrue(RutValidator.isValid("19023819-9"));
    }

    @Test
    public void validateFakeRut() {
        assertFalse(RutValidator.isValid("19023819-4"));
    }

    @Test
    public void validateRutWithPoint() {
        assertTrue(RutValidator.isValid("19.023.819-9"));
    }

}