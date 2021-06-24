package com.chapters.generics.ex38;

public class Decorator extends BasicCoffee {

    protected BasicCoffee basicCoffee;

    public Decorator(BasicCoffee coffee, double price){
        basicCoffee = coffee;
        basicCoffee.addPrice(price);
    }

    public String getDescription() {
        return basicCoffee.getDescription();
    }
}
