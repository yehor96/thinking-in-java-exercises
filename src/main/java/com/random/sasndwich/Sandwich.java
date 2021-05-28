package com.random.sasndwich;

public class Sandwich extends PortableLunch implements Fastfood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() {
        System.out.println("Sandwich");
        cook();
        eat();
    }

    public static void main(String[] args) {
        new Sandwich();
    }

    @Override
    public void cook() {
        System.out.println("Cook " + getClass().getSimpleName());
    }

    @Override
    public void eat() {
        System.out.println("Eat " + getClass().getSimpleName());
    }
}
