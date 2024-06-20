package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionHandlingExample {
    private static final Logger logger = LogManager.getLogger(ExceptionHandlingExample.class);

    public static void main(String[] args) {
        try {
            handleException();
        } catch (CustomException e) {
            logger.error("Caught CustomException: {}", e.getMessage());
        }

        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            logger.error("Caught ArithmeticException: {}", e.getMessage());
        }
    }

    public static void handleException() throws CustomException {
        throw new CustomException("This is a custom exception");
    }

    public static int divide(int a, int b) {
        return a / b;  // This will throw ArithmeticException if b is 0
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
