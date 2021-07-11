package com.chapters.containersindepth.ex11;

import java.util.Random;

public class IntHolder implements Comparable<IntHolder> {

    private final Random random = new Random();
    private final int value = random.nextInt(100);

    @Override
    public int compareTo(IntHolder o) {
        return Integer.compare(this.value, o.value);
    }

    @Override
    public String toString() {
        return "IntHolder{" +
                "value=" + value +
                '}';
    }
}
