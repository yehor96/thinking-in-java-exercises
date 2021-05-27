package com.chapters.containers.ex31;

import com.chapters.containers.ex31.shapes.Circle;
import com.chapters.containers.ex31.shapes.Shape;
import com.chapters.containers.ex31.shapes.Square;
import com.chapters.containers.ex31.shapes.Triangle;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random();
    private int size;

    public RandomShapeGenerator(int size) {
        this.size = size;
    }

    public RandomShapeGenerator() {
        size = 0;
    }

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public Shape next() {
                counter++;
                return RandomShapeGenerator.this.next();
            }
        };
    }
}
