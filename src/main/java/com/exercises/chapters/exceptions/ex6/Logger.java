package com.exercises.chapters.exceptions.ex6;

import java.util.logging.Level;

public class Logger {
    private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger("");

    public static void logWarning(String msg) {
        logger.log(Level.WARNING, msg);
    }

    public static void logSevere(String msg) {
        logger.log(Level.SEVERE, msg);
    }

    public static void logInfo(String msg) {
        logger.log(Level.INFO, msg);
    }
}
