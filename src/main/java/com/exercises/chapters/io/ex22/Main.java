package com.exercises.chapters.io.ex22;

public class Main {
    public static void main(String[] args) {
        var res = OSExecute.command("javap -c target\\classes\\com\\exercises\\chapters\\io\\ex22\\Main");

        System.out.println(res);
        System.out.println(res.size());
    }
}
