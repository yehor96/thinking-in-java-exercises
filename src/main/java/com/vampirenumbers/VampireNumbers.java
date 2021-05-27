package com.vampirenumbers;

import java.util.Arrays;

public class VampireNumbers {

    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 10;

        for (; value1 <= 9999; value1++) {
            for (; value2 <= 9999; value2++) {
                var result = value1 * value2;
                if (result > 9999) {
                    continue;
                }
                if (isVampire(result, value1, value2)) {
                    System.out.println(result + " = " + value1 + " * " + value2);
                }
            }
            value2 = 10;
        }
        System.out.println("End");
    }

    public static boolean isVampire(int result, int number1, int number2) {
        String number1String = String.valueOf(number1);
        String number2String = String.valueOf(number2);
        String resultString = String.valueOf(result);
        if (number1String.length() != number2String.length()) {
            return false;
        }
        String numbersString = number1String + number2String;
        int length = numbersString.length();
        if (length != resultString.length()) {
            return false;
        }

        char[] arrayNumbers = new char[length];
        char[] arrayResult = new char[length];
        for (int i = 0; i < length; i++) {
            arrayNumbers[i] = numbersString.charAt(i);
            arrayResult[i] = resultString.charAt(i);
        }

        Arrays.sort(arrayNumbers);
        Arrays.sort(arrayResult);
        return Arrays.equals(arrayNumbers, arrayResult);
    }
}