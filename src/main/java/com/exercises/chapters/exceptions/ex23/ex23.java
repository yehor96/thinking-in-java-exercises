package com.exercises.chapters.exceptions.ex23;

public class ex23 {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            try {
                FailingConstructor fc = new FailingConstructor(i);
                // some logic with fc
                fc.dispose();
            } catch (Exception e) {
                System.out.println("Failed to create an object.");
            }
        }
    }

}
