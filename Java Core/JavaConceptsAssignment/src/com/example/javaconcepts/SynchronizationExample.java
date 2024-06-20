package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SynchronizationExample {
    private static final Logger logger = LogManager.getLogger(SynchronizationExample.class);

    private static int counter = 0;

    public static void main(String[] args) {
        // Using synchronized method
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronizedMethod();
            }
        });

        // Using synchronized block
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronizedBlock();
            }
        });

        thread1.start();
        thread2.start();
    }

    public synchronized static void synchronizedMethod() {
        logger.info("Synchronized Method - Counter: " + (++counter));
    }

    public static void synchronizedBlock() {
        synchronized (SynchronizationExample.class) {
            logger.info("Synchronized Block - Counter: " + (++counter));
        }
    }
}
