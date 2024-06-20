package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataTypeExample {
    private static final Logger logger = LogManager.getLogger(DataTypeExample.class);

    private int number = 10;
    private double salary = 50000.0;
    private char grade = 'A';
    private boolean isActive = true;

    private final int finalVariable = 100;

    private static String staticVariable = "I am static";
    private int privateVariable = 200;
    protected int protectedVariable = 300;

    public static void printStatic() {
        logger.info(staticVariable);
    }

    public void printFinal() {
        logger.info("Final Variable: {}", finalVariable);
    }

    public void printPrivate() {
        logger.info("Private Variable: {}", privateVariable);
    }

    public void printProtected() {
        logger.info("Protected Variable: {}", protectedVariable);
    }

    // Main method to demonstrate DataTypeExample
    public static void main(String[] args) {
        printStatic();

        DataTypeExample example = new DataTypeExample();
        example.printFinal();
        example.printPrivate();
        example.printProtected();
    }
}
