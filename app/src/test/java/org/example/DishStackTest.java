package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DishStackTest {
    @Test
    public void testPushAndPeek() {
        DishStack stack = new DishStack(5);
        Dish dish = new Dish("A dish with a fish pattern on it");

        stack.push(dish);
        assertEquals("A dish with a fish pattern on it", stack.peek().description);
    }

    @Test
    public void testPop() {
        DishStack stack = new DishStack(5);
        Dish dish = new Dish("A dish with a fish pattern on it");

        stack.push(dish);
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void testSize() {
        DishStack stack = new DishStack(5);
        assertEquals(0, stack.size());

        stack.push(new Dish("Dish 1"));
        assertEquals(1, stack.size());

        stack.push(new Dish("Dish 2"));
        assertEquals(2, stack.size());
    }

}
