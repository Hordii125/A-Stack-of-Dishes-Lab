package org.example;

public class DishStack {
    Dish[] dishes;
    private int top;
    private final int MAX_SIZE;
    
    public DishStack(int max_size) {
        this.MAX_SIZE = max_size;
        this.dishes = new Dish[MAX_SIZE];
        this.top = -1;  
    }

    public void push(Dish dish) {
        if (top < MAX_SIZE - 1) {
            top++;
            dishes[top] = dish;
        } else {
            System.out.println("Stack is full, cannot push dish: " + dish.description);
        }
    }
        
    public Dish peek() {
        if (top >= 0) {
            return dishes[top];
        } else {
            System.out.println("Stack is empty, cannot peek.");
            return null;
        }
    }

    public Dish pop() {
        if (top >= 0) {
            Dish dish = dishes[top];
            dishes[top] = null; // Clear the reference
            top--;
            return dish;
        } else {
            System.out.println("Stack is empty, cannot pop.");
            return null;
        }
    }

    // some getters
    public int getMaxSize() {
        return MAX_SIZE;
    }

    public int getTop() {
        return top;
    }

    public int size() {
        return top + 1;
    }

}
