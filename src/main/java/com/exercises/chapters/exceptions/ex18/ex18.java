package com.exercises.chapters.exceptions.ex18;

import com.exercises.chapters.exceptions.ex19.HoHumException;
import com.exercises.chapters.exceptions.ex19.VeryImportantException;

public class ex18 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            ex18 lm = new ex18();
            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                throw new Throwable();
            }
        } catch (Throwable e) {
            System.out.println("tt" + e);
        }
    }
}
