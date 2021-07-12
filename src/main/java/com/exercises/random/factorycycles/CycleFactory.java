package com.exercises.random.factorycycles;

public class CycleFactory {

    public Cycle getCycle(int wheels) {
        return new Cycle() {

            @Override
            public int getWheels() {
                return wheels;
            }

            @Override
            public void ride() {
                System.out.println("I have wheels - " + getWheels());
            }
        };
    }
}
