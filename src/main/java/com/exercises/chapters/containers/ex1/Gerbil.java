package com.exercises.chapters.containers.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gerbil {

    int gerbilNumber;

    public Gerbil(int num) {
        gerbilNumber = num;
    }

    public void hop() {
        System.out.printf("Gerbil with number %d is hopping around\n", gerbilNumber);
    }

    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i + 1));
        }

        Iterator<Gerbil> iterator = gerbils.iterator();

        while(iterator.hasNext()){
            iterator.next().hop();
        }
    }

}
