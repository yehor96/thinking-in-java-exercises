package com.exercises.chapters.io.ex22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OSExecute {
    public static List<String> command(String command) {
        List<String> list = new ArrayList<>();

        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader results = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s;
            while ((s = results.readLine()) != null)
                list.add(s);
            BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((s = errors.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
