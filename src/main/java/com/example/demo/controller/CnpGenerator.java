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
        String numbers = String.format("%03d", rand.nextInt(1000));
        int ctrl=rand.nextInt(9)+1;
        String ctrlFormat=String.format("%d", ctrl);
        String formatCNP = String.format("%d%s%s%s%s%s%s" , sex, yearFormat, monthFormat, dayFormat, countyFormat, numbers, ctrlFormat);

        return formatCNP;
    }




}


