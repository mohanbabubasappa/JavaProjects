package com.strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder with initial content
        StringBuilder builder = new StringBuilder("Hello");

        // Append text
        builder.append(", World");
        System.out.println("After append: " + builder);

        // Insert text at a specified index
        builder.insert(5, " Java");
        System.out.println("After insert: " + builder);

        // Replace a substring
        builder.replace(5, 10, " String");
        System.out.println("After replace: " + builder);

        // Delete a substring
        builder.delete(5, 12);
        System.out.println("After delete: " + builder);

        // Reverse the content
        builder.reverse();
        System.out.println("After reverse: " + builder);
    }
}

