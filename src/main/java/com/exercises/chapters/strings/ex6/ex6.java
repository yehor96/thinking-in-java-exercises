package com.exercises.chapters.strings.ex6;

public class ex6 {
    private int anInt;
    private double aDouble;
    private long aLong;
    private float aFloat;

    public ex6(int anInt, double aDouble, long aLong, float aFloat) {
        this.anInt = anInt;
        this.aDouble = aDouble;
        this.aLong = aLong;
        this.aFloat = aFloat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s===%5d\n", "anInt", anInt));
        sb.append(String.format("%-10s===%5.1f\n", "aDouble", aDouble));
        sb.append(String.format("%-10s===%5d\n", "aLong", aLong));
        sb.append(String.format("%-10s===%5.1f\n", "aFloat", aFloat));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ex6(5, 1.2, 10L, 5.0F));
    }
}
