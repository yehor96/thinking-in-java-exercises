package com.exercises.chapters.generics.ex9_10;

public class GenericMethods {
    public <T, F, E> void f(T t, F f, Boolean e) {
        System.out.println(t.getClass().getName());
        System.out.println(f.getClass().getName());
        System.out.println(e.getClass().getName());
    }
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("String", 5, true);
    }
}
