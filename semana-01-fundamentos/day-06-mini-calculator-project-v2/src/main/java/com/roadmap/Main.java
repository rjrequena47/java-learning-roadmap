package com.roadmap;

import com.roadmap.calculator.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Suma 10+5 = " + c.add(10, 5));
        System.out.println("Resta 10-5 = " + c.subtract(10, 5));
        System.out.println("Mult 10*5 = " + c.multiply(10, 5));
        System.out.println("Div 10/4 = " + c.divide(10, 4));

        System.out.println("Pow 2^10 = " + c.pow(2, 10));
        System.out.println("Sqrt 81 = " + c.sqrt(81));
        System.out.println("20% de 250 = " + c.percentage(250, 20));

        try {
            System.out.println("Div 10/0 = " + c.divide(10, 0));
        } catch (Exception e) {
            System.out.println("Esperada: " + e.getMessage());
        }

        try {
            System.out.println("Sqrt -1 = " + c.sqrt(-1));
        } catch (Exception e) {
            System.out.println("Esperada: " + e.getMessage());
        }

        try {
            System.out.println("Pow 10^309 = " + c.pow(10, 309));
        } catch (Exception e) {
            System.out.println("Esperada: " + e.getMessage());
        }

    }
}