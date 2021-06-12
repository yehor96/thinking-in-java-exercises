package com.chapters.generics.ex8.characters;

import com.chapters.generics.ex8.interfaces.GoodCharacter;

public class Legolas implements GoodCharacter {

    private String superpower;

    public Legolas(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public String getSuperpower() {
        return superpower;
    }
}
