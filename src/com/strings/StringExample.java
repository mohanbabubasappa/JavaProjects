package com.strings;

public class StringExample {
    public static void main(String[] args) {
        String text = "Hello, Java Strings!";

        // Print the original string
        System.out.println("Original text: " + text);

        // String length
        System.out.println("Length: " + text.length());

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // Access a character by index
        System.out.println("Character at index 7: " + text.charAt(7));

        // Find a substring
        System.out.println("Index of 'Java': " + text.indexOf("Java"));

        // Replace part of the string
        String replaced = text.replace("Java", "World");
        System.out.println("Replaced text: " + replaced);

        // Split the string into words
        String[] words = text.split(" ");
        System.out.print("Words: ");
        for (String word : words) {
            System.out.print(word + ", ");
        }
        System.out.println();

        // Check if the string contains a substring
        System.out.println("Contains 'Hello': " + text.contains("Hello"));
    }
}

