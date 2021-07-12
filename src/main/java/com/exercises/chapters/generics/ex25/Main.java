package com.exercises.chapters.generics.ex25;

public class Main {

    public static <T extends Inter1> void method1(T item) {
        System.out.println(item.getText1());
    }

    public static <T extends Inter2> void method2(T item) {
        System.out.println(item.getText2());
    }

    public static void main(String[] args) {
        var impl = new InterImpl();
        method1(impl);
        method1(impl);
    }

}
