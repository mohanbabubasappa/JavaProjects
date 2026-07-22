package com.arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the array length
        System.out.println("Array length: " + numbers.length);

        // Access and print each element using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element
        numbers[2] = 99;
        System.out.println("Updated element at index 2: " + numbers[2]);

        // Use an enhanced for loop to print all values
        System.out.print("Array values: ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

