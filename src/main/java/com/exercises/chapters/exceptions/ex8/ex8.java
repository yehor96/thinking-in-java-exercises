package com.exercises.chapters.exceptions.ex8;

import com.exercises.chapters.exceptions.ex4.MyException;

public class ex8 {
    public static void main(String[] args) throws MyException {
        try {
            throw new MyException("Text");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
