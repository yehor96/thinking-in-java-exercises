package com.exercises.chapters.typeinfo.ex16;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Iterable<Coffee> {
    private Factory<?>[] types = {
            new Latte.Factory(),
            new Mocha.Factory(),
            new Cappuccino.Factory(),
            new Americano.Factory(),
            new Breve.Factory(),
    };

    private static Random rand = new Random();

    public CoffeeGenerator() {
    }

    // For iteration:
    private int size = 0;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].create();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for (Coffee c : new CoffeeGenerator(5))
            System.out.println(c);
    }
}
