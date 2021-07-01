package com.chapters.arrays.ex9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Peel<Banana>[] peels = new Peel<Banana>[10];
        List<Peel<Banana>> peels = new ArrayList<>();
        peels.add(new Peel<>());
    }

    static class Banana {

    }

    static class Peel<T> {
    }
}
