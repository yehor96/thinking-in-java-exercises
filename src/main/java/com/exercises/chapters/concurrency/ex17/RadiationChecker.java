package com.exercises.chapters.concurrency.ex17;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RadiationChecker {

    private static int totalRadiation = 0;
    private int sensors;

    public RadiationChecker(int numberOfSensors) {
        sensors = numberOfSensors;
    }

    public static synchronized void updateRadiation(int value) {
        totalRadiation += value;
    }

    @SneakyThrows
    public void startRadiationChecker() {
        ExecutorService es = Executors.newFixedThreadPool(sensors);
        for (int i = 0; i < sensors; i++) {
            es.execute(new Sensor());
        }
        es.shutdown();
        es.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Now total radiation is: " + totalRadiation);
    }
}
