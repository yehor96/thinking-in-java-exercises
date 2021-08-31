package com.exercises.chapters.enums.ex5;

import java.util.List;

public enum LetterType {
    VOWEL("Vowel", List.of('a', 'e', 'i', 'o', 'u')),
    SOMETIMES_A_VOWEL("Sometimes a vowel", List.of('y', 'w')),
    CONSONANT("Consonant", List.of('b', 'c', 'd', 'f', 'g', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z', 'h', 'r'));

    LetterType(String description, List<Character> letters) {
        this.description = description;
        this.letters = letters;
    }

    private final String description;
    private final List<Character> letters;

    public static String of(char letter) {
        if (VOWEL.letters.contains(letter))
            return VOWEL.description;
        if (SOMETIMES_A_VOWEL.letters.contains(letter))
            return SOMETIMES_A_VOWEL.description;
        if (CONSONANT.letters.contains(letter))
            return CONSONANT.description;

        throw new IllegalArgumentException("Not able to map to " + letter);
    }
}