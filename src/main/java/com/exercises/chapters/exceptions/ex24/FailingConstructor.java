package com.exercises.chapters.exceptions.ex24;

public class FailingConstructor {
    public FailingConstructor(int i) throws Exception {
        System.out.println("Creating an object ...");

        if (i == 1) {
            try {
                throw new Exception();
            } catch (Exception e) {
                dispose();
                throw e;
            }
        }

        System.out.println("Successfully created");
    }

    public void dispose() {
        System.out.println("Disposing ...");
    }
}
