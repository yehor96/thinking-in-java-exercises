package com.exercises.chapters.strings.ex8;

import java.util.Arrays;

public class ex8 {
    public static final String KNIGHTS =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(KNIGHTS.split(regex)));
    }

    public static void main(String[] args) {
        split("you");
        split("the");
    }
}
