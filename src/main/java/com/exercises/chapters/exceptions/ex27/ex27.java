package com.exercises.chapters.exceptions.ex27;

public class ex27 {
    public static void main(String[] args) {
        String[] array = new String[2];

        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
