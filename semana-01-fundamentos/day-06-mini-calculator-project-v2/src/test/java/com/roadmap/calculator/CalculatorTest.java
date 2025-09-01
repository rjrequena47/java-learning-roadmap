package com.roadmap.calculator;

import com.roadmap.exception.CalculatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private static final double EPS = 1e-9;
    private final Calculator c = new Calculator();

    @Test
    void add_ok() { assertEquals(15.0, c.add(10, 5), EPS); }

    @Test
    void subtract_ok() { assertEquals(5.0, c.subtract(10, 5), EPS); }

    @Test
    void multiply_ok() { assertEquals(50.0, c.multiply(10, 5), EPS); }

    @Test
    void divide_ok() { assertEquals(2.5, c.divide(10, 4), EPS); }

    @Test
    void divide_by_zero() { assertThrows(CalculatorException.class, () -> c.divide(10, 0)); }

    @Test
    void sqrt_ok() { assertEquals(3.0, c.sqrt(9), EPS); }

    @Test
    void sqrt_negative_num() { assertThrows(CalculatorException.class, () -> c.sqrt(-1)); }

    @Test
    void pow_ok() { assertEquals(1024.0, c.pow(2,10), EPS); }

    @Test
    void pow_overflow_non_finite_result() {
        assertThrows(CalculatorException.class, () -> c.pow(10, 309));
    }

    @Test
    void percentage_ok() { assertEquals(20.0, c.percentage(200, 10), EPS); }

    @Test
    void percentage_negative_percent() {
        assertEquals(-10.0, c.percentage(200, -5), EPS);
    }

    @Test
    void inputs_nan_rejected() {
        assertThrows(CalculatorException.class, () -> c.add(Double.NaN, 1));
        assertThrows(CalculatorException.class, () -> c.percentage(Double.POSITIVE_INFINITY, 10));
    }

}
