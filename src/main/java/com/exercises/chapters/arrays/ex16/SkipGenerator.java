package com.exercises.chapters.arrays.ex16;

import com.exercises.chapters.typeinfo.ex12.cofee.Generator;

public class SkipGenerator {
    public static class Integer implements Generator<java.lang.Integer> {

        public Integer() {
            this.increment = 1;
        }

        public Integer(int increment) {
            this.increment = increment;
        }

        private final int increment;
        private int value = 0;

        public java.lang.Integer next() {
            value = value + increment;
            return value;
        }
    }
}
