package com.example.demo.controller;
import java.util.Random;

public class GenereazaCNP {
    Random rand = new Random();
    int sex = rand.nextInt(9) + 1;
    int an = rand.nextInt(100);
    int luna = rand.nextInt(12) + 1;
    int zi = rand.nextInt(31) + 1;
    int judet = rand.nextInt(52) + 1;
    int ctrl = rand.nextInt(1000);

    public static String genereazaCNP() {
       return null;
    }
}


