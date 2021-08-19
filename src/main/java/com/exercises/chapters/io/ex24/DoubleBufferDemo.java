package com.exercises.chapters.io.ex24;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class DoubleBufferDemo {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        DoubleBuffer ib = bb.asDoubleBuffer();
        ib.put(new double[]{11.1, 42.5, 47.8, 99.1, 143.551, 81.1, 101.6});
        System.out.println(ib.get(3));
        ib.put(3, 1.811);
        ib.flip();
        while (ib.hasRemaining()) {
            double i = ib.get();
            System.out.println(i);
        }
    }
}