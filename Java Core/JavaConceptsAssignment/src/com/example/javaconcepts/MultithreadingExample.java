package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MultithreadingExample {
    private static final Logger logger = LogManager.getLogger(MultithreadingExample.class);

    public static void main(String[] args) {
        // Creating threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        // Starting threads
        thread1.start();
        thread2.start();
    }

    // Runnable implementation
    static class MyRunnable implements Runnable {
        private final String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                logger.info(name + ": " + i);
                try {
                    Thread.sleep(100); // Simulating some task
                } catch (InterruptedException e) {
                    logger.error("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }
}
