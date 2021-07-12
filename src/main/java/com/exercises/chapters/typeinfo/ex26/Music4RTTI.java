package com.exercises.chapters.typeinfo.ex26;

import com.exercises.random.musics.Note;
import com.exercises.random.musics.Playable;

import java.util.stream.Stream;

public class Music4RTTI {
    public static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }

    public static void clearSpitValve(Playable i) {
        System.out.println("Clearing spit valve for " + i.getClass().getSimpleName());
    }

    public static void tuneAll(Playable[] instruments) {
        Stream.of(instruments).forEach(i -> {
            tune(i);
            if(i instanceof Wind) {
                clearSpitValve(i);
            }
        });
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
