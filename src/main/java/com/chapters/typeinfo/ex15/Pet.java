package com.chapters.typeinfo.ex15;

public class Pet {
    protected String name;

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        super();
    }
}

class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Dog> {
        public Dog create() {
            return new Dog();
        }
    }
}

class Mutt extends Dog {
    public Mutt(String name) {
        super(name);
    }

    public Mutt() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Mutt> {
        public Mutt create() {
            return new Mutt();
        }
    }
}

class Pug extends Dog {
    public Pug(String name) {
        super(name);
    }

    public Pug() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Pug> {
        public Pug create() {
            return new Pug();
        }
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Cat> {
        public Cat create() {
            return new Cat();
        }
    }
}

class Gerbil extends Pet {
    public Gerbil(String name) {
        super(name);
    }

    public Gerbil() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Gerbil> {
        public Gerbil create() {
            return new Gerbil();
        }
    }
}

class EgyptianMau extends Cat {
    public EgyptianMau(String name) {
        super(name);
    }

    public EgyptianMau() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<EgyptianMau> {
        public EgyptianMau create() {
            return new EgyptianMau();
        }
    }
}

class Manx extends Cat {
    public Manx(String name) {
        super(name);
    }

    public Manx() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Manx> {
        public Manx create() {
            return new Manx();
        }
    }
}

class Cymric extends Manx {
    public Cymric(String name) {
        super(name);
    }

    public Cymric() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Cymric> {
        public Cymric create() {
            return new Cymric();
        }
    }
}

class Rodent extends Pet {
    public Rodent(String name) {
        super(name);
    }

    public Rodent() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Rodent> {
        public Rodent create() {
            return new Rodent();
        }
    }
}

class Rat extends Rodent {
    public Rat(String name) {
        super(name);
    }

    public Rat() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Rat> {
        public Rat create() {
            return new Rat();
        }
    }
}

class Mouse extends Rodent {
    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Mouse> {
        public Mouse create() {
            return new Mouse();
        }
    }
}

class Hamster extends Rodent {
    public Hamster(String name) {
        super(name);
    }

    public Hamster() {
        super();
    }

    public static class Factory implements com.chapters.typeinfo.ex16.Factory<Hamster> {
        public Hamster create() {
            return new Hamster();
        }
    }
}
