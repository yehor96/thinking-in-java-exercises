package com.exercises.chapters.generics.ex28;

import com.exercises.chapters.generics.ex28.storage.Generics1;
import com.exercises.chapters.generics.ex28.storage.Generics2;
import com.exercises.chapters.generics.ex28.storage.Storage;
import com.exercises.chapters.typeinfo.ex11.Pet;
import com.exercises.chapters.typeinfo.ex11.Pets;

public class Main {

    public static final Storage<Pet> myStorage = new Storage<>();

    public static void main(String[] args) {
        Generics1<Pet> setter = new Generics1<>(myStorage);
        Generics2<Pet> getter = new Generics2<>(myStorage);

        Pets.arrayList(5).forEach( p -> {
            contravariance(setter, p);
            covariance(getter);
        });
    }

    public static Pet covariance(Generics2<? extends Pet> generics2) {
        return generics2.get();
    }

    public static void contravariance(Generics1<? super Pet> generics1 , Pet pet) {
        generics1.set(pet);
    }

}
