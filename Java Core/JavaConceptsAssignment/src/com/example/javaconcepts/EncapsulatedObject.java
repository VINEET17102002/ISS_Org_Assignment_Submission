package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EncapsulatedObject {
    private static final Logger logger = LogManager.getLogger(EncapsulatedObject.class);

    private String data;

    public EncapsulatedObject(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    // Main method to demonstrate EncapsulatedObject
    public static void main(String[] args) {
        EncapsulatedObject obj = new EncapsulatedObject("Data");
        logger.info("Encapsulated Data: {}", obj.getData());
    }
}
