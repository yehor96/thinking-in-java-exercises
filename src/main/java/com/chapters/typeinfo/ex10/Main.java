package com.chapters.typeinfo.ex10;

public class Main {
    public static void main(String[] args) {
        char[] item1 = {'a', 'b', 'c', 'd', 'e'};
        Object item2 = new Object();

        checkIfObject(item1);
        checkIfObject(item2);
    }

    public static <T> void checkIfObject(T arg) {
        System.out.println("Is array?");
        System.out.println(arg.getClass().getSimpleName() + " - " + arg.getClass().isArray());
        System.out.println("Is object?");
        System.out.println(arg.getClass().getSimpleName() + " - " + arg.getClass().isInstance(Object.class));
    }
}
