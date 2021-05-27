package com.chapters.exceptions.ex24;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            try {
                FailingConstructor obj = new FailingConstructor(i);
                obj.dispose();
            } catch (Exception e) {
                System.out.println("Failed to create an object.");
            }
        }
    }
}
