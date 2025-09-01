package com.roadmap.kata;

import java.util.List;
import java.util.stream.Collectors;

public class NumberUtils {

    public static List<Integer> filterAndSquareEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static int sumOfPositives(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n > 0)
                .reduce(0, Integer::sum);
    }

}
