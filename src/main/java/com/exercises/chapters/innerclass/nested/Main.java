package com.exercises.chapters.innerclass.nested;

public class Main {
    public static void main(String[] args) {

        ASDa.Inn.Deeper.method();

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Inner.Deeper deeper = inner.new Deeper();
        deeper.method();
    }
}
