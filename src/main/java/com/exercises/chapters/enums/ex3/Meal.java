package com.exercises.chapters.enums.ex3;

public class Meal {
    public static void main(String[] args) {
        for (Course course : Course.values()) {
            Food food = course.randomSelection();
            System.out.println(food);
        }
    }
}
