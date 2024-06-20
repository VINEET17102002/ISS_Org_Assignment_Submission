package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bike {
    private static final Logger logger = LogManager.getLogger(Bike.class);

    public void ride() {
        logger.info("Generic bike is riding");
    }
}
