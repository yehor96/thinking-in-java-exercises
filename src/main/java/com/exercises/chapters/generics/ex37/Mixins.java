package com.exercises.chapters.generics.ex37;

class Mixin extends BasicImp implements TimeStamped, SerialNumbered {

    private final TimeStamped timeStamp = new TimeStampedImp();
    private final SerialNumbered serialNumber = new SerialNumberedImp();
    private final Colored colored;

    public Mixin(String color) {
        colored = new ColoredImpl(color);
    }

    public long getStamp() {
        return timeStamp.getStamp();
    }

    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }

    public String getColor() {
        return colored.getColor();
    }
}

public class Mixins {
    public static void main(String[] args) {

        Mixin mixin1 = new Mixin("White");
        Mixin mixin2 = new Mixin("Black");

        mixin1.set("test string 1");
        mixin2.set("test string 2");

        System.out.println(mixin1.get() + " " +
                mixin1.getStamp() + " " +
                mixin1.getSerialNumber() + " " +
                mixin1.getColor());
        System.out.println(mixin2.get() + " " +
                mixin2.getStamp() + " " +
                mixin2.getSerialNumber() + " " +
                mixin2.getColor());
    }
}