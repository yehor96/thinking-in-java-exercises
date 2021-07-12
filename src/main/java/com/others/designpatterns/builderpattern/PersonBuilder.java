package com.others.designpatterns.builderpattern;

public class PersonBuilder {

    private final Person instance = new Person();

    public PersonBuilder name(String name) {
        instance.setName(name);
        return this;
    }

    public PersonBuilder age(int age) {
        instance.setAge(age);
        return this;
    }

    public PersonBuilder sex(SEX sex) {
        instance.setSex(sex);
        return this;
    }

    public PersonBuilder nationality(String nationality) {
        instance.setNationality(nationality);
        return this;
    }

    public Person build() {
        return instance;
    }
}

