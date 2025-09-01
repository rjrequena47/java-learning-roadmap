package com.roadmap;

import com.roadmap.model.Student;
import com.roadmap.service.StreamExamples;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StreamExamplesTest {

    private final List<Student> students = Arrays.asList(
            new Student(1, "Alice", 22),
            new Student(2, "Bob", 19),
            new Student(3, "Charlie", 23),
            new Student(4, "Diana", 20)
    );

    private final StreamExamples se = new StreamExamples();

    @Test
    public void testFilterByAge() {
        List<Student> result = se.filterByAge(students, 20);
        assertEquals(3, result.size());
        assertTrue(result.stream().allMatch(s -> s.getAge() >= 20));
    }

    @Test
    public void testGetNamesInUpperCase() {
        List<String> result = se.getNamesInUpperCase(students);
        assertEquals(Arrays.asList("ALICE", "BOB", "CHARLIE", "DIANA"), result);
    }

    @Test
    public void testGetAverageAge() {
        double avgAge = se.getAverageAge(students);
        assertEquals((22 + 19 + 23 + 20) / 4.0, avgAge);
    }

    @Test
    public void testJoinNames() {
        String names = se.getNamesAsString(students);
        assertTrue(names.contains("Alice") && names.contains("Bob") &&
                   names.contains("Charlie") && names.contains("Diana"));
    }

}
