package com.roadmap.kata;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testFilterAndUppercase() {
        List<String> input = List.of("hi", "java", "code", "world");
        List<String> result = StringUtils.filterAndUppercase(input);
        assertEquals(List.of("JAVA", "CODE", "WORLD"), result);
    }

    @Test
    void testCountWordsWithLetter() {
        List<String> input = List.of("java", "kotlin", "c++");
        long count = StringUtils.countWordsWithLetter(input, 'a');
        assertEquals(1, count);
    }

}
