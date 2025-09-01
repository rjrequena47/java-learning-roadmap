package com.roadmap.kata;

import com.roadmap.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonServiceTest {

    @Test
    void testFilterAdults() {
        List<Person> people = List.of(
                new Person("Ana", 17, "Caracas"),
                new Person("Ricardo", 35, "Valencia")
        );

        List<Person> result = PersonService.filterAdults(people);
        assertEquals(1, result.size());
        assertEquals("Ricardo", result.getFirst().getName());
    }

    @Test
    void testNamesFromCity() {
        List<Person> people = List.of(
                new Person("Alejandra", 25, "Caracas"),
                new Person("Maria", 30, "Barquisimeto"),
                new Person("Ricardo", 35, "Valencia")
        );

        List<String> result = PersonService.namesFromCity(people, "Caracas");
        assertEquals("Alejandra", result.getFirst());
    }

}
