package com.chapters.exceptions.ex22;

public class FailingConstructor {

    public FailingConstructor(int i) throws Exception {
        System.out.println("Creating an object ...");

        if (i == 1)
            throw new Exception();

        System.out.println("Successfully created");
    }
}
