package com.chapters.exceptions.ex4;

public class MyException extends RuntimeException {
    private String txt;

    public MyException(String text) {
        txt = text;
    }

    public String getTxt() {
        return txt;
    }

}
