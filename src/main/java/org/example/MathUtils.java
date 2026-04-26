package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {

    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        logger.info("Cộng {} va {}", a, b);
        return a + b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public void hamTest() {
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
    }
}