package com.roadmap.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15.0, calc.add(10.0,5.0));
    }

    @Test
    void testSubtract() {
        assertEquals(5.0, calc.subtract(10.0, 5.0));
    }

    @Test
    void testMultiply() {
        assertEquals(50.0, calc.multiply(10.0, 5.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(10.0, 5.0));
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(CalculatorException.class, () -> calc.divide(10,0));
    }

}
