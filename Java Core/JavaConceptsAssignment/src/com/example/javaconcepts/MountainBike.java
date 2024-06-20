package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MountainBike extends Bike {
    private static final Logger logger = LogManager.getLogger(MountainBike.class);

    @Override
    public void ride() {
        logger.info("Mountain bike is riding on rough terrain");
    }
}
