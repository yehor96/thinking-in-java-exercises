package com.exercises.chapters.concurrency.ex11;

import lombok.SneakyThrows;

public class MyTask implements Runnable {

    private Container container;

    public MyTask(Container container) {
        this.container = container;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            var res = container.getText().split(" ");
            if (!(Integer.parseInt(res[0]) % 2 == 1 && Integer.parseInt(res[1]) % 2 == 0)) {
                throw new RuntimeException("Failure!");
            }
            System.out.println("Success!");
        }
    }
}
