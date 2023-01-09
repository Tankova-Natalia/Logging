package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(
            Main.class);

    private static final String FILENAME = "/file/does/not/exist";

    public static void main(String[] args) {
        logger.info("Just a log message.");
        logger.debug("Message for debug level.");
        try {
            Files.readAllBytes(Paths.get(FILENAME));
        } catch (IOException ioex) {
            logger.error("Failed to read file {}.", FILENAME, ioex);
        }
    }
}
