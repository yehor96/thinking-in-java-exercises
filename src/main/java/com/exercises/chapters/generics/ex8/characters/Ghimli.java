package com.exercises.chapters.generics.ex8.characters;

import com.exercises.chapters.generics.ex8.interfaces.GoodCharacter;

public class Ghimli implements GoodCharacter {

    private final String superpower;

    public Ghimli(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public String getSuperpower() {
        return superpower;
    }
}