package com.roadmap.kata;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    @Test
    void testFilterAndSquareEvenNumbers() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        List<Integer> result = NumberUtils.filterAndSquareEvenNumbers(input);
        assertEquals(List.of(4, 16), result);
    }

    @Test
    void testSumOfPositives() {
        List<Integer> input = List.of(-1, 2, -3, 4);
        int result = NumberUtils.sumOfPositives(input);
        assertEquals(6, result);
    }

}
