package com.chapters.generics.ex8;

import com.chapters.generics.ex8.interfaces.StoryCharacter;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] superpowers = {"Flying", "Talking to dead", "Being invisible", "Spitting poison"};
        Random random = new Random();
        CharacterGenerator generator = new CharacterGenerator();

        for (int i = 0; i < 10; i++) {
            String superpower = superpowers[random.nextInt(superpowers.length)];
            StoryCharacter c1 = generator.next(superpower);
            System.out.println(c1.getDescription());
        }
    }
}
