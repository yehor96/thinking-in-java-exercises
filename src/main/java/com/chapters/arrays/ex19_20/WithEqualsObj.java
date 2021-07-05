package com.chapters.arrays.ex19_20;

public class WithEqualsObj extends NoEqualsObj {

    public WithEqualsObj(int value) {
        super(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof WithEqualsObj)) return false;
        WithEqualsObj object = (WithEqualsObj) obj;
        return this.field == object.field;
    }
}
