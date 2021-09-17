package com.exercises.chapters.concurrency.ex17;

import java.util.Random;

public class Sensor implements Runnable {

    private static int counter = 1;
    private final int id;

    public Sensor() {
        synchronized (this) {
            id = counter++;
        }
    }

    @Override
    public void run() {
        int radiation = new Random().nextInt(10);
        System.out.println("Sensor with id " + id + " found radiation " + radiation);
        RadiationChecker.updateRadiation(radiation);
    }
}
