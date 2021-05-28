package com.random.readablescanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(new Charnik(5));
        while(s.hasNext())
            System.out.println(s.next());
    }
}
