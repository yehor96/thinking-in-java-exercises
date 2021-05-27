package com.factorycycles;

public class Main {
    public static void main(String[] args) {
        CycleFactory factory = new CycleFactory();

        callCycle(factory.getCycle(1));
        callCycle(factory.getCycle(2));
        callCycle(factory.getCycle(3));
    }

    public static void callCycle(Cycle cycle) {
        cycle.ride();
    }
}
