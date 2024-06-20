package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LocalThreadSafetyExample {
    private static final Logger logger = LogManager.getLogger(LocalThreadSafetyExample.class);

    public static void main(String[] args) {
        LocalThreadSafetyExample example = new LocalThreadSafetyExample();
        example.runThreads();
    }

    public void runThreads() {
        Thread thread1 = new Thread(this::printNumbers);
        Thread thread2 = new Thread(this::printNumbers);

        thread1.start();
        thread2.start();
    }

    public void printNumbers() {
        for (int i = 0; i < 5; i++) {
            int localCounter = i;
            logger.info("Thread: {}, Local Counter: {}", Thread.currentThread().getName(), localCounter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
