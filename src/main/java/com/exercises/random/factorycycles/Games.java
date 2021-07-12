package com.exercises.random.factorycycles;

interface Game {
    boolean move();
}

class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

public class Games {
    public static void playGame(Game s) {
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(new Checkers());
        playGame(new Chess());
    }
}
