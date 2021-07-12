package com.exercises.chapters.typeinfo.ex15;

import com.exercises.chapters.typeinfo.ex16.Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PetCreator15 {
    private Random rand = new Random();

    public List<Factory<? extends Pet>> types = List.of(
            new Mutt.Factory(),
            new Pug.Factory(),
            new Gerbil.Factory(),
            new EgyptianMau.Factory(),
            new Manx.Factory(),
            new Cymric.Factory(),
            new Rodent.Factory(),
            new Rat.Factory(),
            new Mouse.Factory(),
            new Hamster.Factory()
    );

    public Pet randomPet() {
        int n = rand.nextInt(types.size());
        return types.get(n).create();
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++)
            result[i] = randomPet();
        return result;
    }

    public List<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
