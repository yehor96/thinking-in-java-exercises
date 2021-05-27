package com.chapters.innerclass;

public class Another {

    public Outer getOuter(int value) {
        return new Outer(value) {
            {
                System.out.println("Inside anonymous class");
                getField();
            }

            public void getField() {
                System.out.println(field);
            }
        };
    }

}
