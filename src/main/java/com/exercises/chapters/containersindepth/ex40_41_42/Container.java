package com.exercises.chapters.containersindepth.ex40_41_42;

import com.exercises.chapters.containersindepth.ex9.RandomGenerator;
import lombok.Getter;

import java.util.Comparator;

public class Container implements Comparable<Container> {

    @Getter
    private String value1;
    @Getter
    private String value2;

    private static final RandomGenerator.String stringProvider = new RandomGenerator.String();

    public Container(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public static SecondValueComparator COMPARE_BY_SECOND_VALUE = new SecondValueComparator();

    public static Container getContainer() {
        return new Container(stringProvider.next().toLowerCase(), stringProvider.next().toLowerCase());
    }

    @Override
    public int compareTo(Container o) {
        return value1.compareTo(o.getValue1());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Container)) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        Container other = (Container)obj;
        return value1.equals(other.getValue1());
    }

    @Override
    public int hashCode() {
        return 17 * value1.hashCode();
    }

    @Override
    public String toString() {
        return "{Container of " + value1 + " and " + value2 + "}";
    }

    private static class SecondValueComparator implements Comparator<Container> {

        @Override
        public int compare(Container o1, Container o2) {
            return o1.getValue2().compareTo(o2.getValue2());
        }
    }
}
