package com.rodents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Rodent> rodents = new ArrayList<>(Arrays.asList(new Class1(), new Class2()));

        var it = rodents.iterator();

        while (it.hasNext()) {
            it.next().runMethod();
        }
    }
}
