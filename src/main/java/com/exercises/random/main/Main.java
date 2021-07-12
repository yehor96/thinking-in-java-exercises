package com.exercises.random.main;

import com.exercises.random.main.interfaces.Face;

public class Main {
    public static void main(String[] args) {
        Face face = new Child();
        face.listen();
        face.look();
        face.talk();
    }
}
