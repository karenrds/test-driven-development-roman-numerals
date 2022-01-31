# test-driven-development-roman-numerals
Function to Convert digits to roman numerals
checks when a given number is greater then 0 and is between and equal to 1 and 1000 and returns a roman numberal

Function to convert Roman numerals to digits
when a small number is in front of a larger number, the larger number is subtracted from the smaller
I = 1, V = 5 
IV(5-1)=4

In Test case used @ParameterizedTest(), @MethodSource()
- to run a single method multiple times using different values of number/roman numeral parameters
- to pass multiple parameters in the parameterized test, used a Stream of Arguments
