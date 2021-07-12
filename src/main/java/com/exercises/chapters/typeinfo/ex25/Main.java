package com.exercises.chapters.typeinfo.ex25;

import com.exercises.chapters.typeinfo.ex25.securepackage.PrivateThings;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        PrivateThings pt = new PrivateThings();
        Class<? extends  PrivateThings> ptClass = pt.getClass();

        Method[] methods = ptClass.getDeclaredMethods();
        for(var method : methods) {
            try {
                method.setAccessible(true);
                method.invoke(pt);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}
