package com.exercises.chapters.typeinfo.ex20;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        RTTIChecker checker = new RTTIChecker(List.of(MyCustomClass.class, String.class));
        checker.readTypeInfo();
        checker.removeLiteral(String.class);
        checker.addLiteral(Integer.class);
        checker.readTypeInfo();
    }
}
