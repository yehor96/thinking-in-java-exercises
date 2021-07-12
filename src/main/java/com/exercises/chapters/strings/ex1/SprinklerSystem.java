package com.exercises.chapters.strings.ex1;

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {

        return "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }

    public static void main(String[] args) {
        var time = System.currentTimeMillis();
        SprinklerSystem sprinklers = new SprinklerSystem();
        for (int i = 0; i < 100; i++) {
            System.out.println(sprinklers);
        }
        System.out.println(System.currentTimeMillis() - time);
    }
}
