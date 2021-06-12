package com.chapters.generics.ex8.characters;

import com.chapters.generics.ex8.interfaces.GoodCharacter;

public class Gendalf implements GoodCharacter {

    private final String superpower;

    public Gendalf(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public String getSuperpower() {
        return superpower;
    }
}