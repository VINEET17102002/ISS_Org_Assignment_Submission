package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoadBike extends Bike {
    private static final Logger logger = LogManager.getLogger(RoadBike.class);

    @Override
    public void ride() {
        logger.info("Road bike is riding on smooth roads");
    }
}
