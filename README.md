# test-driven-development-roman-numerals
Function to Convert digits to roman numerals
checks when a given number is greater then 0 and is between and equal to 1 and 1000 and returns a roman numberal

Function to convert Roman numerals to digits
smaller number in front of any larger number — indicates subtraction
larger number in front of any smaller number — indicates addition
IV(1-4)=4
VI(5+1)=6

In Test case used @ParameterizedTest(), @MethodSource()
- to run a single method multiple times using different values of number/roman numeral parameters
- to pass multiple parameters in the parameterized test, used a Stream of Arguments
