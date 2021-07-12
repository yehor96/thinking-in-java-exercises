package com.exercises.chapters.exceptions.ex23;

public class FailingConstructor {

    private Objik obj1;
    private Objik obj2;

    public FailingConstructor(int i) throws Exception {
        System.out.println("Creating an object ...");
        obj1 = new Objik();

        if (i == 1) {
            try {
                throw new Exception();
            } catch (Exception e) {
                obj1.dispose();
                throw e;
            }
        }

        obj2 = new Objik();
        System.out.println("Successfully created");
    }

    public void dispose() {
        obj1.dispose();
        obj2.dispose();
    }
}
