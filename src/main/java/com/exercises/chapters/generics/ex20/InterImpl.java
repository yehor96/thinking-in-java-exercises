package com.exercises.chapters.generics.ex20;

public class InterImpl implements Inter{
    @Override
    public void scoreGoal() {
        System.out.println("Score goal! " + sayNum());
    }

    @Override
    public int sayNum() {
        return 5;
    }

    public void theEnd() {
        System.out.println("End!");
    }
}
