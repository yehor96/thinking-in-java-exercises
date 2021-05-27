package com.chapters.exceptions.ex5;

public class Main {
    public static void main(String[] args) {
        int elements = 1;
        String[] strings = new String[elements];
        while (elements <= 6) {
            try {
                System.out.println(strings[5]);
                System.out.println("ending!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of Bounds! " + e.getMessage());
            } finally {
                strings = new String[++elements];
            }
        }
    }
}
