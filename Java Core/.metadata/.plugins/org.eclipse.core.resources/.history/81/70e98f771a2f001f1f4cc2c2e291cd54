package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Animal {
    private static final Logger logger = LogManager.getLogger(Animal.class);

    public void sound() {
        logger.info("Animal makes a sound");
    }

    // Main method to demonstrate Animal (inherited by Dog)
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();
    }
}
