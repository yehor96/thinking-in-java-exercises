package com.exercises.chapters.exceptions.ex15;

import com.exercises.chapters.exceptions.ex14.OnOffException1;
import com.exercises.chapters.exceptions.ex14.OnOffException2;
import com.exercises.chapters.exceptions.ex14.Switch;

public class OnOfSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {


            try {
                sw.on();
                f();
            } catch (OnOffException1 e) {
                System.out.println("OnOffException1");
            } catch (OnOffException2 e) {
                System.out.println("OnOffException2");
            } finally {
                sw.off();
            }


        } finally {
            System.out.println("Final state: " + sw);
        }
    }
}
