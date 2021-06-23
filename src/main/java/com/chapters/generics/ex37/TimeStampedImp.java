package com.chapters.generics.ex37;

public class TimeStampedImp implements TimeStamped {
    private final long timeStamp;

    public TimeStampedImp() {
        timeStamp = System.currentTimeMillis();
    }

    public long getStamp() {
        return timeStamp;
    }
}
