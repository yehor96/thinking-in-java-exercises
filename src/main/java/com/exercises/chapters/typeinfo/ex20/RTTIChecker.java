package com.exercises.chapters.typeinfo.ex20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class RTTIChecker {

    private final List<Class<?>> literals;

    public RTTIChecker(List<Class<?>> literals) {
        this.literals = new ArrayList<>(literals);
    }

    public void readTypeInfo() {
        literals.forEach(this::readInfo);
    }

    public void addLiteral(Class<?> literal) {
        literals.add(literal);
    }

    public void removeLiteral(Class<?> literal) {
        literals.remove(literal);
    }

    private void readInfo(Class<?> aClass){
        System.out.println("Class name: " + aClass.getSimpleName());
        displayMembers(Method.class, aClass);
        displayMembers(Field.class, aClass);
        displayMembers(Constructor.class, aClass);
        System.out.println("***********************");
    }

    private void displayMembers(Class<? extends Member> member, Class<?> aClass) {
        Member[] members = null;
        if (Field.class.equals(member)) {
            members = aClass.getDeclaredFields();
        } else if (Constructor.class.equals(member)) {
            members = aClass.getDeclaredConstructors();
        } else if (Method.class.equals(member)) {
            members = aClass.getDeclaredMethods();
        } else {
            throw new IllegalArgumentException("Member " + member + " is not expected.");
        }

        System.out.println("***  " + member.getSimpleName() + "s  ***");
        for (var m : members) {
            System.out.println(m);
        }
    }

}
