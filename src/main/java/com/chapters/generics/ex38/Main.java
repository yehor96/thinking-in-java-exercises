package com.chapters.generics.ex38;

public class Main {
    public static void main(String[] args) {
        SteamedMilk coffeeWithSteamMilk = new SteamedMilk(new BasicCoffee(), 1.25);
        Foam coffeeWithFoam = new Foam(new BasicCoffee(), 2.0);

        coffeeWithFoam.addFoam();
        coffeeWithSteamMilk.addSteamedMilk();

        System.out.println(coffeeWithSteamMilk.getDescription());
        System.out.println(coffeeWithFoam.getDescription());
    }
}
