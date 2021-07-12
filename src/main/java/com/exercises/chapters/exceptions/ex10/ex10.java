package com.exercises.chapters.exceptions.ex10;

import com.exercises.chapters.exceptions.ex9.Exception1;
import com.exercises.chapters.exceptions.ex9.Exception3;

public class ex10 {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception exception1) {
            exception1.printStackTrace();
        }
    }

    public static void f() throws Exception3 {
        try {
            g();
        } catch (Exception1 exception1) {
            var exx = new Exception3("3");
            exx.initCause(exception1);
            throw exx;
        }
    }

    public static void g() throws Exception1 {
        throw new Exception1("1");
    }

}
