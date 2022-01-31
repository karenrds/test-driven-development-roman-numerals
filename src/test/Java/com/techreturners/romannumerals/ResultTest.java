package com.techreturners.romannumerals;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ResultTest {
    private Result result;
    @BeforeEach
    public void setup() {
        result = new Result();
    }

    @ParameterizedTest()
    @MethodSource("intToString")
    public void checkConvertDigitsToRomanNumerals(String romanNumber, int number){
        assertEquals(romanNumber,result.convertDigitsToRomanNumerals(number));
    }
    private static Stream<Arguments> intToString() {
        return Stream.of(
                arguments("I", 1),
                arguments("IX",9),
                arguments("CL", 150)
        );
    }

    @ParameterizedTest()
    @MethodSource("stringToInt")
    public void checkConvertRomanNumeralsToDigits(int digit, String romanNumeral){
        assertEquals(digit,result.convertRomanNumeralsToDigits(romanNumeral));
    }
    private static Stream<Arguments> stringToInt() {
        return Stream.of(
                arguments(1, "I"),
                arguments(6, "VI"),
                arguments(7, "VII"),
                arguments(650, "DCL")
        );
    }


}