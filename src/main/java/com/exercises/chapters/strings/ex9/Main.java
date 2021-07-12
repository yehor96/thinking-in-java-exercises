package com.exercises.chapters.strings.ex9;

import com.exercises.chapters.strings.ex8.ex8;

public class Main {
    public static void main(String[] args) {
        String result = ex8.KNIGHTS.replaceAll("[a|e|o|i|u]", "_");

        System.out.println(result);
    }
}