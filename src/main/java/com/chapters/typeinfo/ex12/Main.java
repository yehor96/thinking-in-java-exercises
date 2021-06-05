package com.chapters.typeinfo.ex12;

import com.chapters.typeinfo.ex12.cofee.Coffee;
import com.chapters.typeinfo.ex12.cofee.CoffeeGenerator;

public class Main {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        for (Coffee coffee : new CoffeeGenerator(10)) {
            System.out.print(coffee.getClass().getSimpleName() + " ");
            counter.count(coffee);
        }
        System.out.println();
        System.out.print(counter);
    }
}
