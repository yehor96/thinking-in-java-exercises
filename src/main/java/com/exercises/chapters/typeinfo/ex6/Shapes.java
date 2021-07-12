package com.exercises.chapters.typeinfo.ex6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

abstract class Shape {

    protected boolean highlighted;

    void draw() {
        System.out.println(this.getClass().getSimpleName() + ".draw()");
    }

    public String toString() {
        return this.getClass().getSimpleName() + ".flag:" + highlighted;
    }

    public void setHighlighted(boolean b) {
        highlighted = b;
    }

    public boolean getHighlighted() {
        return highlighted;
    }
}

class Circle extends Shape {
}

class Square extends Shape {
}

class Triangle extends Shape {
}

public class Shapes {

    public static final Class<? extends Shape> typeToHighlight = Circle.class;

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        Collections.shuffle(shapeList);

        for (Shape shape : shapeList) {
            shape.draw();
        }

        highlightShapes(shapeList, typeToHighlight);

        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }

    public static void highlightShapes(List<Shape> listOfShapes, Class<? extends Shape> type) {
        listOfShapes.forEach(s -> {
            if (s.getClass() == type) {
                s.setHighlighted(true);
            }
        });
    }
}