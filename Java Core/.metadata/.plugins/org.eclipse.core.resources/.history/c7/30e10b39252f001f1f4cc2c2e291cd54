package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VolatileExample {
    private static final Logger logger = LogManager.getLogger(VolatileExample.class);

    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread writerThread = new Thread(() -> {
            logger.info("Starting writer thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            logger.info("Flag set to true");
        });

        Thread readerThread = new Thread(() -> {
            logger.info("Starting reader thread");
            while (!flag) {
                // Busy wait until flag is true
            }
            logger.info("Flag is now true");
        });

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();

        logger.info("End of main method");
    }
}
