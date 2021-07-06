package com.company;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sum() {
        assertEquals(10, calculator.sum(4, 6));
    }

    @Test
    void sub() {
        assertEquals(10, calculator.sub(15, 5));
    }

    @Test
    void mul() {
        assertEquals(10, calculator.mul(10, 1));
    }

    @Test
    void div() {
        assertEquals(10, calculator.div(100, 10));
    }

    @Test
    void divZero() {
        assertThrows(ArithmeticException.class, () -> {calculator.div(10, 0);});
    }
}