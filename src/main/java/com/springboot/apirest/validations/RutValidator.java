package com.springboot.apirest.validations;

public class RutValidator {

    public static boolean isValid(String rut) {

        if (rut == null || rut.isEmpty()) {
            return true;
        }

        String[] rutArray = rut.replace(".", "").split("-");

        return validateRut(Integer.parseInt(rutArray[0]), rutArray[1].toUpperCase().charAt(0));
    }

    private static boolean validateRut(int rut, char dv) {
        int m = 0;
        int s = 1;

        for (; rut != 0; rut /= 10) {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }
        return dv == (char) (s != 0 ? s + 47 : 75);
    }

}