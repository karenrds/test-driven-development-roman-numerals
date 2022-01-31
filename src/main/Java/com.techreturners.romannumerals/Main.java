package com.techreturners.romannumerals;

public class Main {

    public static void main(String[] args) {
        Result result = new Result();
        int value = result.convertRomanNumeralsToDigits("MMM");
        System.out.println(value);

        String value2 = result.convertDigitsToRomanNumerals(150);
        System.out.println(value2);
    }
}
