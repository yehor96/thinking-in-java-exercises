package com.chapters.arrays.ex1;

public class Main {

    public static void main(String[] args) {
        method(new Belling[]{new Belling(), new Belling(), new Belling()});

        Belling[] bellings = {new Belling(), new Belling()};
        //redundant explicit array creation with 'new':
        bellings = new Belling[]{new Belling(), new Belling()};
    }

    static void method(Belling[] array) {

    }

    static class Belling {

    }
}
