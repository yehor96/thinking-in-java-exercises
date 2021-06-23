package com.chapters.generics.ex1;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    @Override
    public String toString() {
        return "Holder of \'" + a + "\'";
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.get();
        System.out.println(a);

        h3.set(new Juk());
        Juk j = (Juk) h3.get();
        System.out.println(j);
    }
}

class Automobile{
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
class Juk extends Automobile{}
