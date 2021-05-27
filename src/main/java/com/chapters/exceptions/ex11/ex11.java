package com.chapters.exceptions.ex11;

import com.chapters.exceptions.ex9.Exception1;

public class ex11 {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception exception1) {
            exception1.printStackTrace();
        }
    }

    public static void f() {
        try {
            g();
        } catch (Exception1 exception1) {
            throw new RuntimeException(exception1);
        }
    }

    public static void g() throws Exception1 {
        throw new Exception1("1");
    }
}
