package com.roadmap;

import com.roadmap.model.Student;
import com.roadmap.service.StreamExamples;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Alice", 22),
                new Student(2, "Bob", 19),
                new Student(3, "Charlie", 23),
                new Student(4, "Diana", 20)
        );

        StreamExamples se = new StreamExamples();

        System.out.println("Mayores de 20 años: " + se.filterByAge(students, 20));
        System.out.println("Nombres en Mayúsculas: " + se.getNamesInUpperCase(students));
        System.out.println("Promedio de Edad: " + se.getAverageAge(students));
        System.out.println("Nombres concatenados: " + se.getNamesAsString(students));
    }
}