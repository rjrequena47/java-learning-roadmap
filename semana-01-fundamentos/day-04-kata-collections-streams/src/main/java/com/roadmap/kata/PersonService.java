package com.roadmap.kata;

import java.util.List;
import java.util.stream.Collectors;

import com.roadmap.model.Person;

public class PersonService {

    public static List<Person> filterAdults(List<Person> people) {
        return people.stream()
                .filter(p -> p.getAge() >= 18)
                .collect(Collectors.toList());
    }

    public static List<String> namesFromCity(List<Person> people, String city) {
        return people.stream()
                .filter(p -> p.getCity().equalsIgnoreCase(city))
                .map(Person::getName)
                .collect(Collectors.toList());
    }

}
