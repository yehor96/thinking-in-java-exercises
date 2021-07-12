package com.exercises.chapters.generics.ex19;

import java.util.ArrayList;

public class Cargo extends ArrayList<Container> {
    public Cargo(int nContainers, int nProducts) {
        for (int i = 0; i < nContainers; i++) {
            add(new Container(nProducts));
        }
    }
}
