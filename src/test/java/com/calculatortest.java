package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2,3));
    }

    @Test
    void testSubtract() {
        assertEquals(3, calc.subtract(5,2));
    }

    @Test
    void testMultiply() {
        assertEquals(12, calc.multiply(3,4));
    }

    @Test
    void testDivide() {
        assertEquals(5, calc.divide(10,2));
    }
}
