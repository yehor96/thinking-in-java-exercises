package com.exercises.chapters.typeinfo.ex5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        Collections.shuffle(shapeList);

        for (Shape shape : shapeList) {
            shape.draw();
        }

        System.out.println();

        for(Shape shape : shapeList) {
            rotate(shape);
        }
    }

    public static void rotate(Shape shape) {
        if(!(shape instanceof Circle)) {
            System.out.println("Rotating " + shape.getClass().getSimpleName());
        }
    }
}
