package com.roadmap.service;

import com.roadmap.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    // CREATE
    public void addStudent(Student student) {
        students.add(student);
    }

    // READ
    public Student getStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    // UPDATE
    public boolean updateStudent(int id, String newName, int newAge) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .map(s -> {
                    s.setName(newName);
                    s.setAge(newAge);
                    return true;
                })
                .orElse(false);

        /*Student student = getStudentById(id);
        if (student != null) {
            student.setName(newName);
            student.setAge(newAge);
            return true;
        }
        return false;*/
    }

    // DELETE
    public boolean deleteStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }

}
