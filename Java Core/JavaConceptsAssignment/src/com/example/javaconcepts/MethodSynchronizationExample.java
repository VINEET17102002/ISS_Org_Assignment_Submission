package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MethodSynchronizationExample {
    private static final Logger logger = LogManager.getLogger(MethodSynchronizationExample.class);

    private int counter = 0;

    public static void main(String[] args) {
        MethodSynchronizationExample example = new MethodSynchronizationExample();
        example.runThreads();
    }

    public void runThreads() {
        Thread thread1 = new Thread(this::incrementCounter);
        Thread thread2 = new Thread(this::incrementCounter);

        thread1.start();
        thread2.start();
    }

    public synchronized void incrementCounter() {
        for (int i = 0; i < 5; i++) {
            counter++;
            logger.info("Counter: {}", counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
