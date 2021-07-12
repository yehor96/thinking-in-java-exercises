package com.exercises.chapters.generics.ex19;

import java.util.ArrayList;

public class Ship extends ArrayList<Cargo> {
    public Ship(int nCargo, int nContainers, int nProducts) {
        for (int i = 0; i < nCargo; i++)
            add(new Cargo(nContainers, nProducts));
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Cargo a : this)
            for (Container s : a)
                for (Product p : s) {
                    result.append(p);
                    result.append("\n");
                }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Ship(2, 4, 1));
    }
}