package com.chapters.exceptions.ex30;

class Annoyance extends RuntimeException {
}

class Sneeze extends Annoyance {
}

public class Human {

    public static void main(String[] args) {
        try {
            try {
                throw new Sneeze();
            } catch (Sneeze s) {
                throw new RuntimeException(s);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getCause());
        }
    }
}
