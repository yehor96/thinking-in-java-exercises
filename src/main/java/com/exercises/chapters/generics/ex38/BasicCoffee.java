package com.exercises.chapters.generics.ex38;

public class BasicCoffee {

    private double price = 0.0;

    public void addPrice(double price) {
        this.price += price;
    }

    public String getDescription() {
        return "Coffee for " + price;
    }
}
