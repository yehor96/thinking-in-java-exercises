package com.exercises.chapters.concurrency.ex17;

public class Main {
    public static void main(String[] args) {
        RadiationChecker rc = new RadiationChecker(50);
        rc.startRadiationChecker();
    }
}
