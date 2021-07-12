package com.exercises.random.advanture;

public class DiamondImpl implements Diamond {
    @Override
    public void f() {
        System.out.println("f()");
    }

    public static void main(String[] args) {
        new DiamondImpl().f();
    }
}
