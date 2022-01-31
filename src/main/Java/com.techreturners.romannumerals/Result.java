package com.techreturners.romannumerals;

import java.util.Locale;

public class Result {
    private int resultDigits = 0;
    private String resultRomanNumerals = "";

    int value(char roman) {
        int numberValue = 0;
        switch (roman) {
            case 'I':
                numberValue = 1;
                break;
            case 'V':
                numberValue = 5;
                break;
            case 'X':
                numberValue = 10;
                break;
            case 'L':
                numberValue = 50;
                break;
            case 'C':
                numberValue = 100;
                break;
            case 'D':
                numberValue = 500;
                break;
            case 'M':
                numberValue = 1000;
                break;
            default:
                System.out.println("Error in Roman Numeral");
                break;
        }
        return numberValue;
    }

    public String convertDigitsToRomanNumerals(int digit) {
        while (digit > 0) {
            if (digit >= 1000) {
                resultRomanNumerals += "M";
                digit -= 1000;
            } else if (digit >= 900) {
                resultRomanNumerals += "CM";
                digit -= 900;
            } else if (digit >= 500) {
                resultRomanNumerals += "D";
                digit -= 500;
            } else if (digit >= 100) {
                resultRomanNumerals += "C";
                digit -= 100;
            } else if (digit >= 90) {
                resultRomanNumerals += "XC";
                digit -= 90;
            } else if (digit >= 50) {
                resultRomanNumerals += "L";
                digit -= 50;
            } else if (digit >= 40) {
                resultRomanNumerals += "XL";
                digit -= 40;
            } else if (digit >= 10) {
                resultRomanNumerals += "X";
                digit -= 10;
            } else if (digit >= 9) {
                resultRomanNumerals += "IX";
                digit -= 9;
            } else if (digit >= 5) {
                resultRomanNumerals += "V";
                digit -= 5;
            } else if (digit >= 4) {
                resultRomanNumerals += "IV";
                digit -= 4;
            } else if (digit >= 1) {
                resultRomanNumerals += "I";
                digit -= 1;
            } else {
                break;
            }
        }
        return resultRomanNumerals;
    }

    public int convertRomanNumeralsToDigits(String str) {
        str = str.toUpperCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            String strChar = Character.toString(str.charAt(i));

            int leftCharacter = value(str.charAt(i));
            if (i + 1 < str.length()) {
                int rightCharacter = value(str.charAt(i + 1));
                if (leftCharacter >= rightCharacter) {
                    resultDigits += leftCharacter;
                } else {
                    resultDigits += rightCharacter - leftCharacter;
                    i++;
                }
            } else {
                resultDigits += leftCharacter;
            }
        }
        return resultDigits;
    }
}
