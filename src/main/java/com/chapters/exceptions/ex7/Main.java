package com.chapters.exceptions.ex7;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger("");

    public static void main(String[] args) {

        String[] array = new String[2];
        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.severe(e.getMessage());
        }
    }
}
