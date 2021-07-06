package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void testToString() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 17, -18);
        quadraticEquation.findRoots();
        assertEquals("1.0 -18.0", quadraticEquation.toString());
    }
}