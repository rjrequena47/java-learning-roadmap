package com.roadmap;

import com.roadmap.calculator.Calculator;
import com.roadmap.calculator.CalculatorException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double numA = 10;
        double numB = 5;

        System.out.println("SUMA: " + calc.add(numA, numB));
        System.out.println("RESTA: " + calc.subtract(numA, numB));
        System.out.println("MULTIPLICACIÓN: " + calc.multiply(numA, numB));

        try {
            System.out.println("DIVISIÓN: " + calc.divide(numA, 0.0));
        } catch (CalculatorException ce) {
            System.out.println("ERROR: " + ce.getMessage());
        }
    }
}