package io.keyzelsoft.list;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class linkedListTest {

    @Test
    public void createArrayListTest() {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple"); // O(1)
        fruits.add("Banana"); // O(1)
        fruits.addFirst("Strawberry"); // O(1)
        fruits.addLast("Mango"); // O(1)
        System.out.println(fruits);
        // Overall complexity: O(1) for each add operation
        assertEquals("[Strawberry, Apple, Banana, Mango]", fruits.toString());

        //Accessing and Modifying Elements
        String firstFruit = fruits.getFirst(); // O(1)
        String lastFruit = fruits.getLast(); // O(1)
        fruits.set(1, "Blueberry"); // O(n), where n is the position of the element as it may need to traverse the list
        String index2 = fruits.get(1); //O(n)
        System.out.println(fruits);
        assertEquals("[Strawberry, Blueberry, Banana, Mango]", fruits.toString());

        fruits.removeFirst(); // O(1)
        fruits.removeLast(); // O(1)
        fruits.remove("Banana"); // O(n), need to traverse the list to find the element
        System.out.println(fruits);
        // Removing the first or last element is O(1), but removing by value requires traversing, making it O(n)
        assertEquals("[Blueberry]", fruits.toString());

        fruits.add(null);
        fruits.add("Strawberry");

        System.out.println(fruits);
        assertEquals("[Blueberry, null, Strawberry]", fruits.toString());
    }
}
