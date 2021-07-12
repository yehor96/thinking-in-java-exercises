package com.exercises.chapters.containers.ex27;

public class Command {

    public Command(String value) {
        this.value = value;
    }

    private String value;

    public void operation() {
        System.out.println(value);
    }

}
