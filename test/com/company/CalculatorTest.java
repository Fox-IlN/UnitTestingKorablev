package com.company;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sum() {
        double sum = calculator.sum(4, 6);
        assertEquals(10, sum);
    }

    @Test
    void sub() {
        double sub = calculator.sub(15, 5);
        assertEquals(10, sub);
    }

    @Test
    void mul() {
        double mul = calculator.mul(10, 1);
        assertEquals(10, mul);
    }

    @Test
    void div() {
        double div = calculator.div(100, 10);
        assertEquals(10, div);
    }

    @Test
    void divZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.div(10, 0);});
    }
}