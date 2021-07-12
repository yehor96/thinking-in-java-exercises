package com.exercises.chapters.containers.ex17;

import java.util.Iterator;
import java.util.Map;

public class Gerbil {

    static int number = 0;
    int id;

    public Gerbil() {
        id = ++number;
    }

    public void hop() {
        System.out.printf("Gerbil with number %d is hopping around%n", id);
    }


    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = Map.of(
                "Mark", new Gerbil(),
                "John", new Gerbil(),
                "Tracey", new Gerbil(),
                "Markus", new Gerbil(),
                "Ronney", new Gerbil());


        Iterator<String> iterator = gerbils.keySet().iterator();

        while (iterator.hasNext()) {
            gerbils.get(iterator.next()).hop();
        }
    }

}
