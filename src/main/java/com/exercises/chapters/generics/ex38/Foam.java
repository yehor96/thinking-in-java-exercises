package com.exercises.chapters.generics.ex38;

public class Foam extends Decorator {

    private static final String withFoam = " with foam";

    public Foam(BasicCoffee coffee, double price) {
        super(coffee, price);
    }

    public void addFoam() {
        System.out.println("More Foam!");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + withFoam;
    }
}
