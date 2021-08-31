package com.exercises.chapters.enums.ex5;

import java.util.Random;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.println((char) c + ", " + c + ": " + LetterType.of((char) c));
        }
    }
}
