package com.chapters.generics.ex8.interfaces;

public interface StoryCharacter {

    default boolean isGoodCharacter() {
        return this instanceof GoodCharacter;
    }

    default String getName() {
        return getClass().getSimpleName();
    }

    default String getDescription() {
        var decency = "Is a" + (isGoodCharacter() ? " good " : " bad ") + "character";
        return getName() + ". Skill: " + getSuperpower() + ". " + decency;
    }

    String getSuperpower();
}
