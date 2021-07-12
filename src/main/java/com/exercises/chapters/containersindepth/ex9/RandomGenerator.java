package com.exercises.chapters.containersindepth.ex9;

import com.exercises.chapters.arrays.ex12_13.CountingGenerator;

public class RandomGenerator {

    private RandomGenerator() {

    }

    private static final CountingGenerator.Character charGenerator = new CountingGenerator.Character();

    public static class String {

        private final int size;

        public String() {
            size = 6;
        }

        public String(int size) {
            this.size = size;
        }

        public java.lang.String next() {
            char[] buf = new char[size];
            for (int i = 0; i < size; i++)
                buf[i] = charGenerator.next();
            return new java.lang.String(buf);
        }
    }

}
