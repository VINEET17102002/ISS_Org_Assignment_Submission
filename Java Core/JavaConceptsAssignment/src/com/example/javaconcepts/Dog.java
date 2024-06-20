package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog extends Animal {
    private static final Logger logger = LogManager.getLogger(Dog.class);

    @Override
    public void sound() {
        logger.info("Dog barks");
    }

    // Main method to demonstrate Dog class
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
