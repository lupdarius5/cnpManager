package com.example.demo.controller;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public  class CnpGenerator {


    public static String generateCNP() {
        Random rand = new Random();
        int sex = rand.nextInt(9) + 1;
        int year = rand.nextInt(100);
        String yearFormat=String.format("%02d", year);
        int month = rand.nextInt(12) + 1;
        String monthFormat=String.format("%02d", month);
        int day = rand.nextInt(31) + 1;
        String dayFormat=String.format("%02d", day);
        int county = rand.nextInt(52) + 1;
        String countyFormat=String.format("%02d", county);
        String ctrl = String.format("%03d", rand.nextInt(1000));
        String formatCNP = String.format("%d%s%s%s%s%s" , sex, yearFormat, monthFormat, dayFormat, countyFormat, ctrl);
        String controlDigit = String.valueOf(calculateControl(formatCNP));

        return formatCNP + controlDigit;
    }

    private static int calculateControl(String formatCNP) {
        int[] constant={2,7,9,1,4,6,3,5,8,2,7,9};
        int sum=0;

        for (int i = 0; i < 12; i++) {
            sum += Character.getNumericValue(formatCNP.charAt(i)) * constant[i];
        }

        int control = sum % 11;
        if (control == 10) {
            control = 1;
        }

        return control;
    }


}


