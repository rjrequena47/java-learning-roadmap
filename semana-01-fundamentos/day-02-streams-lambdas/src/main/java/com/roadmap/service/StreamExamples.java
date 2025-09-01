package com.roadmap.service;

import com.roadmap.model.Student;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {

    // Filtrar estudiantes mayores o iguales a cierta edad
    public List<Student> filterByAge(List<Student> students, int minAge) {
        return students.stream()
                .filter(s -> s.getAge() >= minAge)
                .collect(Collectors.toList());
    }

    // Obtener los nombres en Mayúsculas
    public List<String> getNamesInUpperCase(List<Student> students) {
        return students.stream()
                .map(s -> s.getName().toUpperCase())
                .collect(Collectors.toList());
    }

    // Calcular el promedio de edad
    public double getAverageAge(List<Student> students) {
        return students.stream()
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);
    }

    // Reducir a un String con todos los nombres separados por comas
    public String getNamesAsString(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }
}
