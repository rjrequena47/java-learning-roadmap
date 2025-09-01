package com.roadmap.kata;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

    public static List<String> filterAndUppercase(List<String> words) {
        return words.stream()
                .filter(word -> word.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static long countWordsWithLetter(List<String> words, char letter){
        return words.stream()
                .filter(w -> w.toLowerCase().contains(Character.toString(letter)))
                .count();
    }

}
