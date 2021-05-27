package com.readablescanner;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

public class Charnik implements Readable {

    Random rand = new Random();
    int counter;
    int length;
    char[] array;

    public Charnik(int length) {
        counter = length;
        this.length = length;
        array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = (char) ('a' + rand.nextInt(26));
        }
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        counter--;
        if (counter == 0) {
            return -1;
        } else {
            for (int i = 0; i < length; i++) {
                cb.append(array[i]);
            }
            return length;
        }
    }
}
