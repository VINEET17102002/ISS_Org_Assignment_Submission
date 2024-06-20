package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayExample {
    private static final Logger logger = LogManager.getLogger(ArrayExample.class);

    public void demonstrateArrays() {
        int[] numbers = {1, 2, 3, 4, 5};
        logger.info("Array Length: {}", numbers.length);
    }

    // Main method to demonstrate ArrayExample
    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        example.demonstrateArrays();
    }
}
