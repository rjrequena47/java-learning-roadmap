package com.roadmap;

import com.roadmap.model.GraduateStudent;
import com.roadmap.model.Student;
import com.roadmap.service.StudentService;


public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // Adding students
        studentService.addStudent(new Student(1, "Alice", 20));
        studentService.addStudent(new Student(2, "Bob", 22));
        studentService.addStudent(new GraduateStudent(3, "Charlie", 24, "AI Research"));

        // Display all students
        System.out.println("All Students:");
        studentService.getAllStudents().forEach(System.out::println);

        // Update a student
        System.out.println("\nUpdating Bob's age to 23:");
        studentService.updateStudent(2, "Bob", 23);
        System.out.println(studentService.getStudentById(2));

        // Delete a student
        System.out.println("\nDeleting Alice:");
        studentService.deleteStudent(1);
        studentService.getAllStudents().forEach(System.out::println);
    }
}