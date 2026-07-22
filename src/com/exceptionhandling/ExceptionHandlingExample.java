package com.exceptionhandling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println("Number at index 1: " + numbers[1]);
            System.out.println("Number at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Finally block always executes.");
        }

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Program continues after exception handling.");
    }
}

