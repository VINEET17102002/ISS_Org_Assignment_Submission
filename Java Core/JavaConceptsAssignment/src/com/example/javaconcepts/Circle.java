package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Circle extends Shape {
    private static final Logger logger = LogManager.getLogger(Circle.class);

    @Override
    public void draw() {
        logger.info("Drawing a Circle");
    }

    // Main method to demonstrate Circle
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}
