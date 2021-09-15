package com.exercises.chapters.concurrency.ex14;

import java.time.LocalTime;
import java.util.TimerTask;

import static java.time.temporal.ChronoUnit.SECONDS;

public class MyTask extends TimerTask {

    int id;

    public MyTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Hello! Task with id " + id + " :: " + LocalTime.now().truncatedTo(SECONDS));
    }
}
