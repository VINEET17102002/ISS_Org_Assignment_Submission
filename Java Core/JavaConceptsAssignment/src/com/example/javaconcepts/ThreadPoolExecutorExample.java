package com.example.javaconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadPoolExecutorExample {
    private static final Logger logger = LogManager.getLogger(ThreadPoolExecutorExample.class);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submitting tasks to thread pool
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new MyTask("Task " + i));
        }

        // Shutting down the executor
        executorService.shutdown();
    }

    static class MyTask implements Runnable {
        private final String name;

        public MyTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            logger.info(name + " started");
            try {
                Thread.sleep(100); // Simulating some task
            } catch (InterruptedException e) {
                logger.error("Task interrupted: " + e.getMessage());
            }
            logger.info(name + " completed");
        }
    }
}
