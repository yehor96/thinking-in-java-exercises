package com.exercises.chapters.enums.ex2;

import java.util.Random;

enum CartoonCharacter {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private static final Random rand = new Random();

    public static CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}

public class EnumImplementation {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println(CartoonCharacter.next());
    }
}
