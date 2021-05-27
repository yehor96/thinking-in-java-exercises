package com.main;

import com.main.interfaces.Face;

public class Main {
    public static void main(String[] args) {
        Face face = new Child();
        face.listen();
        face.look();
        face.talk();
    }
}
