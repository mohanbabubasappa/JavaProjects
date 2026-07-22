package com.strings;

public class SplitMethod {
	public static void main(String[] args) {
        String text = "Java split method example";

        System.out.println("Original text: " + text);

        // Split by space character
        String[] words = text.split(" ");
        System.out.println("Split by spaces:");
        for (String word : words) {
            System.out.println(word);
        }

        // Split by a specific substring
        String[] parts = text.split("method");
        System.out.println("Split by 'method':");
        for (String part : parts) {
            System.out.println("[" + part.trim() + "]");
        }

        // Split with limit parameter
        String[] limited = text.split(" ", 3);
        System.out.println("Split with limit 3:");
        for (String part : limited) {
            System.out.println(part);
        }
    }
}
