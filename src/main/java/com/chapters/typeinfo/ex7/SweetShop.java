package com.chapters.typeinfo.ex7;

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    // args format: "Java SweetShop {0} {1} {2}"
    public static void main(String[] args) {
        System.out.println("inside main");
        checkArgsValidity(args);



        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("com.chapters.typeinfo.ex7.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn’t find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }

    public static void checkArgsValidity(String[] args) {
        if (args.length < 3 || !(args[0] + args[1]).equals("Java SweetShop"))
            throw new IllegalArgumentException();
    }
}