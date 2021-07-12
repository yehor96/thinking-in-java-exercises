package com.exercises.chapters.exceptions.ex22;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            try {
                FailingConstructor obj = new FailingConstructor(i);
            } catch (Exception e) {
                System.out.println("Failed to create an object.");
            }
        }
    }
}
