package com.exercises.chapters.generics.ex38;

public class SteamedMilk extends Decorator {

    private static final String withSteamedMilk = " with steamed milk";

    public SteamedMilk(BasicCoffee coffee, double price) {
        super(coffee, price);
    }

    public void addSteamedMilk() {
        System.out.println("More Steamed Milk!");
    }

    public String getDescription() {
        return super.getDescription() + withSteamedMilk;
    }
}
