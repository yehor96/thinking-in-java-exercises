package com.chapters.containers.ex31;

public class Main {

    public static void main(String[] args) {
        for (var each : new RandomShapeGenerator(5)) {
            each.draw();
        }
    }
}
