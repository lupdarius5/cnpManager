package com.example.demo.controller;

public class ValidareCNP {

    public static boolean esteValid(String cnp) {
        if (cnp == null || cnp.length() != 13 || !cnp.matches("\\d+")) {
            return false;
        }

        int sex = Character.getNumericValue(cnp.charAt(0));
        int an = Integer.parseInt(cnp.substring(1, 3));
        int luna = Integer.parseInt(cnp.substring(3, 5));
        int zi = Integer.parseInt(cnp.substring(5, 7));
        int judet = Integer.parseInt(cnp.substring(7, 9));

        if (sex < 1 || sex > 9) {
            return false;
        }
        if (luna < 1 || luna > 12) {
            return false;
        }
        if (zi < 1 || zi > 31) {
            return false;
        }
        if (judet < 1 || judet > 52) {
            return false;
        }

        int[] constanta = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
        int control = Character.getNumericValue(cnp.charAt(12));
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            sum += Character.getNumericValue(cnp.charAt(i)) * constanta[i];
        }

        int calculControl = sum % 11;
        if (calculControl == 10) {
            calculControl = 1;
        }

        return control == calculControl;

    }
}