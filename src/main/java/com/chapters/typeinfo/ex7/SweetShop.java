package com.chapters.typeinfo.ex7;

//{Args: Candy Gum}
import java.util.stream.Stream;

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

    public static void main(String[] args) {
        System.out.println("inside main");
        Stream.of(args).forEach(SweetShop::loadClassFromArg);
    }

    public static void loadClassFromArg(String className) {

        String packageName = SweetShop.class.getPackageName();
        String fullClassName = packageName + "." + className;

        try {
            Class.forName(fullClassName);
        } catch (ClassNotFoundException e) {
            System.out.println("Not found class with name " + className + ". Keep looking ...");
        }
    }
}