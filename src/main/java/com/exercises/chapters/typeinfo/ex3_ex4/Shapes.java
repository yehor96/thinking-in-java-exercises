package com.exercises.chapters.typeinfo.ex3_ex4;

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

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        Collections.shuffle(shapeList);
        for (Shape shape : shapeList) {
            shape.draw();
            if(shape instanceof Rhomboid) {
                Rhomboid rhomboid = (Rhomboid) shape;
                System.out.println("Downcasted to Rhomboid - " + rhomboid);
                // To Circle:
                // Circle circle = (Circle) shape;
                // System.out.println("Downcasted to Circle - " + circle);
            }
        }
    }
}
