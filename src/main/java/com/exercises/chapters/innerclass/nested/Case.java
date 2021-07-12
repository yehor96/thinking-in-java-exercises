package com.exercises.chapters.innerclass.nested;

public interface Case {

    static void mm() {
        System.out.println("mm");
    }

    static void bb() {
        System.out.println("mm");
    }

    class MyClass {
        public static void method() {
            System.out.println("Met!");
            mm();
            bb();
        }
    }
}
