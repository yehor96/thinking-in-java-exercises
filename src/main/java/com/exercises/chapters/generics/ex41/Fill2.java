package com.exercises.chapters.generics.ex41;

import com.exercises.chapters.typeinfo.ex11.Cat;
import com.exercises.chapters.typeinfo.ex11.Dog;
import com.exercises.chapters.typeinfo.ex11.Gerbil;
import com.exercises.chapters.typeinfo.ex11.Mutt;
import com.exercises.chapters.typeinfo.ex11.Pet;
import com.exercises.chapters.typeinfo.ex12.cofee.Generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface Addable<T> {
    void add(T t);
}

public class Fill2 {
    public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++)
            try {
                addable.add(classToken.getConstructor().newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }

    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
        for (int i = 0; i < size; i++)
            addable.add(generator.next());
    }
}

class AddableCollectionAdapter<T> implements Addable<T> {
    private final Collection<T> c;

    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }

    public void add(T item) {
        c.add(item);
    }
}

class Adapter {
    public static <T> Addable<T> collectionAdapter(Collection<T> c) {
        return new AddableCollectionAdapter<>(c);
    }
}

class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
    public void add(T item) {
        super.add(item);
    }
}


//##############################//

class Fill2Test {
    public static void main(String[] args) {
        List<Pet> carrier = new ArrayList<>();
        Fill2.fill(new AddableCollectionAdapter<>(carrier), Dog.class, 3);
        Fill2.fill(Adapter.collectionAdapter(carrier), Cat.class, 2);
        for (Pet c : carrier)
            System.out.println(c);
        System.out.println("----------------------");
        AddableSimpleQueue<Pet> coffeeQueue = new AddableSimpleQueue<>();
        Fill2.fill(coffeeQueue, Gerbil.class, 4);
        Fill2.fill(coffeeQueue, Mutt.class, 1);
        for (Pet c : coffeeQueue)
            System.out.println(c);
    }
}
