package com.example.javaconcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinalKeywordExample {
    private static final Logger logger = LogManager.getLogger(FinalKeywordExample.class);

    // Final instance variable
    private final int finalVariable = 100;

    public static void main(String[] args) {
        FinalKeywordExample example = new FinalKeywordExample();
        example.demoFinalVariable();
        example.demoFinalMethod();
    }

    public void demoFinalVariable() {
        logger.info("Final Variable: {}", finalVariable);
        // finalVariable = 200; // This will cause a compilation error
    }

    // Final method
    public final void demoFinalMethod() {
        logger.info("This is a final method and cannot be overridden.");
    }
}

// Final class
final class FinalClass {
    // Class implementation
}

// The following class definition will cause a compilation error
// because FinalClass cannot be subclassed
// class SubClass extends FinalClass {}
