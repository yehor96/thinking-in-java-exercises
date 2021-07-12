package com.exercises.chapters.arrays.ex12_13;

public class Main {

    public static void main(java.lang.String[] args) {
        generateDoubles();
        generateString();
    }

    public static void generateDoubles() {
        var generator = new CountingGenerator.Double();
        for (int i = 0; i < 10; i++) {
            System.out.print(generator.next() + " ");
        }
        System.out.println();
    }

    public static void generateString() {
        var generator = new CountingGenerator.Character();
        StringBuilder sb = new StringBuilder(generator.next());
        for (int i = 0; i < 9; i++) {
            sb.append(generator.next());
        }
        System.out.println(sb.toString());
    }
}
