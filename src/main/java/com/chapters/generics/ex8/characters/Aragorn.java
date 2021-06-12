package com.chapters.generics.ex8.characters;

import com.chapters.generics.ex8.interfaces.GoodCharacter;

public class Aragorn implements GoodCharacter {

    private final String superpower;

    public Aragorn(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public String getSuperpower() {
        return superpower;
    }
}
