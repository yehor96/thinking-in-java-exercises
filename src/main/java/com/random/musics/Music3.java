package com.random.musics;

import java.util.stream.Stream;

public class Music3 {
    public static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Playable[] instruments) {
        Stream.of(instruments).forEach(Music3::tune);
    }

    public static void main(String[] args) {
        var generator = new Generator();
        Playable[] orchestra = generator.getRandoms(5);
        tuneAll(orchestra);
        Stream.of(orchestra).forEach(System.out::println);
    }

    static abstract class Instrument {
        @Override
        public String toString() {
            return "Instrument";
        }

        abstract void adjust();
    }

    static class Wind extends Instrument implements Playable {
        public void play(Note n) {
            System.out.println("Wind.play() " + n);
        }

        @Override
        public String toString() {
            return "Wind";
        }

        void adjust() {
            System.out.println("Adjusting Wind");
        }
    }

    static class Percussion extends Instrument implements Playable {
        public void play(Note n) {
            System.out.println("Percussion.play() " + n);
        }

        @Override
        public String toString() {
            return "Percussion";
        }

        void adjust() {
            System.out.println("Adjusting Percussion");
        }
    }

    static class Stringed extends Instrument implements Playable {
        public void play(Note n) {
            System.out.println("Stringed.play() " + n);
        }

        @Override
        public String toString() {
            return "Stringed";
        }

        void adjust() {
            System.out.println("Adjusting Stringed");
        }
    }

    static class Brass extends Wind {
        public void play(Note n) {
            System.out.println("Brass.play() " + n);
        }

        void adjust() {
            System.out.println("Adjusting Brass");
        }
    }

    static class Woodwind extends Wind {
        public void play(Note n) {
            System.out.println("Woodwind.play() " + n);
        }

        @Override
        public String toString() {
            return "Woodwind";
        }
    }

    static class Hernia extends Wind {
        public void play(Note n) {
            System.out.println("Hernia.play() " + n);
        }

        @Override
        public String toString() {
            return "Hernia";
        }
    }
}
