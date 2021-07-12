package com.exercises.chapters.arrays.ex2;

//{Argument: 5}
public class Main {

    public static void main(String[] args) {
        if (args.length > 1 || args.length == 0) {
            throw new IllegalArgumentException("You should pass exactly one argument value");
        }

        int size = 0;
        try {
            size = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Make sure to specify a number value");
        }

        for (var each : method(size)) {
            System.out.println(each);
        }
    }

    public static Berulli[] method(int size) {
        Berulli[] berullis = new Berulli[size];
        for (int i = 0; i < size; i++) {
            berullis[i] = new Berulli();
        }
        return berullis;
    }

    static class Berulli {
    }
}
