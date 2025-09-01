package com.roadmap.service;

import com.roadmap.model.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    public void testAddAndGetStudent() {
        StudentService service = new StudentService();
        Student student = new Student(1, "Test Student", 20);
        service.addStudent(student);

        Student result = service.getStudentById(1);
        assertNotNull(result);
        assertEquals("Test Student", result.getName());
    }

    @Test
    public void testUpdateStudent() {
        StudentService service = new StudentService();
        service.addStudent(new Student(1, "Alice", 22));

        boolean updated = service.updateStudent(1, "Alice Morgan", 25);
        assertTrue(updated);
        assertEquals("Alice Morgan", service.getStudentById(1).getName());
    }

    @Test
    public void testDeleteStudent() {
        StudentService service = new StudentService();
        service.addStudent(new Student(1, "Rob", 32));

        boolean deleted = service.deleteStudent(1);
        assertTrue(deleted);
        assertNull(service.getStudentById(1));
    }

}
