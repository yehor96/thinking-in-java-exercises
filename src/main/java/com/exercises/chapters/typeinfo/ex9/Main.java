package com.exercises.chapters.typeinfo.ex9;

import com.exercises.chapters.typeinfo.ex8.High;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class<? super High> aClass = High.class;
        boolean flag = false;

        while (!flag) {
            var superClass = aClass.getSuperclass();
            System.out.println("Current class : " + aClass.getSimpleName());
            System.out.println("Its superclass: " + superClass.getSimpleName());

            Field[] fields = aClass.getDeclaredFields();
            System.out.println("Fields of current class: ");
            for (var field : fields) {
                System.out.print(field.getName() + " ");
            }
            System.out.println("\n==============");

            if (superClass.isInstance(Object.class)) {
                flag = true;
            } else {
                aClass = superClass;
            }
        }
    }
}
