package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlockSynchronizationExample {
    private static final Logger logger = LogManager.getLogger(BlockSynchronizationExample.class);

    private int counter = 0;

    public static void main(String[] args) {
        BlockSynchronizationExample example = new BlockSynchronizationExample();
        example.runThreads();
    }

    public void runThreads() {
        Thread thread1 = new Thread(this::incrementCounter);
        Thread thread2 = new Thread(this::incrementCounter);

        thread1.start();
        thread2.start();
    }

    public void incrementCounter() {
        for (int i = 0; i < 5; i++) {
            synchronized (this) {
                counter++;
                logger.info("Counter: {}", counter);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
