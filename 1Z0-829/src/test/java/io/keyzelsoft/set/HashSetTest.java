package io.keyzelsoft.set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class HashSetTest {

    @Test
    public void createHashSetTest() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Attempt to add a duplicate

        System.out.println(fruits); // Note: "Apple" appears only once
        assertEquals(3, fruits.size());
        assertFalse(fruits
                .stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .anyMatch(count -> count > 1));
    }
}
