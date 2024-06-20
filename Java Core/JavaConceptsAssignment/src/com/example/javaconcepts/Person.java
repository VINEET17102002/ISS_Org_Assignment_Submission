package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
    private static final Logger logger = LogManager.getLogger(Person.class);

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        logger.info("Person created - Name: {}, Age: {}", name, age);
    }

    public void greet() {
        logger.info("Hello, my name is {} and I am {} years old.", name, age);
    }

    // Main method to demonstrate Person class
    public static void main(String[] args) {
        Person person = new Person("Cris", 30);
        person.greet();
    }
}
