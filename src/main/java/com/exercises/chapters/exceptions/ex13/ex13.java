package com.exercises.chapters.exceptions.ex13;

import com.exercises.chapters.exceptions.ex9.Exception1;
import com.exercises.chapters.exceptions.ex9.Exception2;
import com.exercises.chapters.exceptions.ex9.Exception3;

public class ex13 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            try {
                thrower(i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Always finally!");
            }
        }
    }

    public static void thrower(int i) throws Exception1, Exception2, Exception3 {
        if (i == 1) throw new Exception1("11");
        if (i == 2) throw new Exception2("22");
        if (i == 3) throw new Exception3("33");
        if (i == 4) throw new NullPointerException("null");
    }
}
