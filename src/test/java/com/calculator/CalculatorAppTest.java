package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAppTest {

    private static final double DELTA = 1e-9; // For floating-point comparisons

    @Test
    void testAdditionPositiveNumbers() {
        assertEquals(8.0, CalculatorApp.performOperation(5.0, 3.0, "+"), DELTA);
    }

    @Test
    void testAdditionPositiveAndNegative() {
        assertEquals(2.0, CalculatorApp.performOperation(5.0, -3.0, "+"), DELTA);
    }

    @Test
    void testAdditionNegativeNumbers() {
        assertEquals(-8.0, CalculatorApp.performOperation(-5.0, -3.0, "+"), DELTA);
    }

    @Test
    void testAdditionWithZero() {
        assertEquals(5.0, CalculatorApp.performOperation(5.0, 0.0, "+"), DELTA);
        assertEquals(-3.0, CalculatorApp.performOperation(0.0, -3.0, "+"), DELTA);
    }

    @Test
    void testAdditionResultingInZero() {
        assertEquals(0.0, CalculatorApp.performOperation(5.0, -5.0, "+"), DELTA);
    }

    @Test
    void testAdditionDecimalNumbers() {
        assertEquals(6.2, CalculatorApp.performOperation(2.5, 3.7, "+"), DELTA);
    }

    @Test
    void testUnknownOperation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculatorApp.performOperation(1.0, 2.0, "*");
        });
        assertEquals("Unknown operation: *", exception.getMessage());
    }
}
