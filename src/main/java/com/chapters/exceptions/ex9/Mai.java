package com.chapters.exceptions.ex9;

public class Mai {
    public static void main(String[] args) {
        try {
            thrower(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void thrower(int i) throws Exception1, Exception2, Exception3 {
        if (i == 1) throw new Exception1("11");
        if (i == 2) throw new Exception2("22");
        if (i == 3) throw new Exception3("33");
    }
}
