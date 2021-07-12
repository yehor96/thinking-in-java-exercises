package com.exercises.chapters.typeinfo.ex8;

public class Main {
    public static void main(String[] args) {
        Class<? super High> aClass = High.class;
        boolean flag = false;

        while (!flag) {
            var superClass = aClass.getSuperclass();
            System.out.println("Current class : " + aClass.getSimpleName());
            System.out.println("Its superclass: " + superClass.getSimpleName());

            if (superClass.isInstance(Object.class)) {
                flag = true;
            } else {
                aClass = superClass;
            }
        }
    }
}
