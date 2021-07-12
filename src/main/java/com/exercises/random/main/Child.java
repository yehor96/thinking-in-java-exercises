package com.exercises.random.main;

import com.exercises.random.main.interfaces.Face;

public class Child implements Face {

    @Override
    public void talk() {
        System.out.println("talk");
    }

    @Override
    public void listen() {
        System.out.println("listen");
    }

    @Override
    public void look() {
        System.out.println("look");
    }
}
