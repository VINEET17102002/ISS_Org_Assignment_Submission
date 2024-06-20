package com.example.javaconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CollectionOperationsExample {
    private static final Logger logger = LogManager.getLogger(CollectionOperationsExample.class);

    public static void main(String[] args) {
        // List operations
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(3);
        numbersList.add(2);
        logger.info("List: " + numbersList);

        // Set operations
        Set<String> namesSet = new HashSet<>();
        namesSet.add("Alice");
        namesSet.add("Bob");
        namesSet.add("Alice");
        logger.info("Set: " + namesSet);

        // Map operations
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "John");
        studentMap.put(2, "Jane");
        studentMap.put(3, "Doe");
        logger.info("Map: " + studentMap);

        // Collection operations on custom objects
        List<CustomObject> customObjects = new ArrayList<>();
        customObjects.add(new CustomObject(1, "John"));
        customObjects.add(new CustomObject(2, "Jane"));
        logger.info("Custom Objects List: " + customObjects);
    }
}
