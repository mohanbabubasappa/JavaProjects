package com.strings;

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer with initial content
        StringBuffer buffer = new StringBuffer("Hello");

        // Append text
        buffer.append(", World");
        System.out.println("After append: " + buffer);

        // Insert text at specified index
        buffer.insert(5, " Java");
        System.out.println("After insert: " + buffer);

        // Replace a substring
        buffer.replace(5, 10, " String");
        System.out.println("After replace: " + buffer);

        // Delete a substring
        buffer.delete(5, 12);
        System.out.println("After delete: " + buffer);

        // Reverse the content
        buffer.reverse();
        System.out.println("After reverse: " + buffer);
    }
}

