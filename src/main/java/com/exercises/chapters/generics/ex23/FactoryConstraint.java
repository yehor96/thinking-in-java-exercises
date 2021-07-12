package com.exercises.chapters.generics.ex23;

interface FactoryI<T> {
    T create(int arg);
}

class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory, int arg) {
        x = factory.create(arg);
    }
}

class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create(int arg) {
        return arg;
    }
}

class Widget {

    private int id;

    private Widget(int id) {
        this.id = id;
    }

    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create(int arg) {
            return new Widget(arg);
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<>(new IntegerFactory(), 5);
        new Foo2<>(new Widget.Factory(), 21);
    }
}