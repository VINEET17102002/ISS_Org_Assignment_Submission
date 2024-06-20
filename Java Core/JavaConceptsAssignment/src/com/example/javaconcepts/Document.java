package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Document implements Printable {
    private static final Logger logger = LogManager.getLogger(Document.class);

    @Override
    public void print() {
        logger.info("Printing Document");
    }

    // Main method to demonstrate Document
    public static void main(String[] args) {
        Document document = new Document();
        document.print();
    }
}
