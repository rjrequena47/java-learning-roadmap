package com.roadmap.calculator;

import com.roadmap.exception.CalculatorException;

public class Calculator {

    private static final double EPS = 1e-12;

    private void validateFinite(String op, double... values) {
        for(double v : values) {
            if (Double.isNaN(v) || Double.isInfinite(v)) {
                throw new CalculatorException(op + ": entrada inválida (NAN/∞)");
            }
        }
    }

    private double ensureFiniteResult(String op, double result) {
        if (!Double.isFinite(result) || Double.isNaN(result)) {
            throw new CalculatorException(op + ": resultado no finito!");
        }
        return result;
    }

    // --- Básicas --- //
    public double add(double a, double b) {
        validateFinite("add", a, b);
        return ensureFiniteResult("add", a + b);
    }

    public double subtract(double a, double b) {
        validateFinite("subtract", a, b);
        return ensureFiniteResult("subtract", a - b);
    }

    public double multiply(double a, double b) {
        validateFinite("multiply", a, b);
        return ensureFiniteResult("multiply", a * b);
    }

    public double divide(double a, double b) {
        validateFinite("divide", a, b);
        if (Math.abs(b) < EPS) {
            throw new CalculatorException("divide: no se puede dividir entre cero!");
        }
        return ensureFiniteResult("divide", a / b);
    }

    // --- Avanzadas --- //
    public double pow(double base, double exp) {
        validateFinite("pow", base, exp);
        double r = Math.pow(base, exp);
        return ensureFiniteResult("pow", r);
    }

    public double sqrt(double value) {
        validateFinite("sqrt", value);
        if(value < 0) {
            throw new CalculatorException("sqrt: no está permitido el calculo de la raíz de un número negativo.");
        }
        return Math.sqrt(value);
    }

    public double percentage(double base, double percent) {
        validateFinite("percentage", base, percent);
        double r = base * (percent / 100.0);
        return ensureFiniteResult("percentage", r);
    }

}
