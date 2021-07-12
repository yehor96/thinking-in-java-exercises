package com.exercises.chapters.strings.ex20;

import java.util.Scanner;

public class Container {
    private static int counter = 0;
    private int id;
    private Scanner scanner;

    private int anInt;
    private double aDouble;
    private String aString;
    private float aFloat;
    private long aLong;

    public Container(String input) {
        scanner = new Scanner(input);
        anInt = scanner.nextInt();
        aDouble = scanner.nextDouble();
        aLong = scanner.nextLong();
        aFloat = scanner.nextFloat();
        aString = scanner.nextLine().trim();
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Container with id #" + id + " {" +
                "anInt=" + anInt +
                ", aDouble=" + aDouble +
                ", aString='" + aString + '\'' +
                ", aFloat=" + aFloat +
                ", aLong=" + aLong +
                '}';
    }
}
