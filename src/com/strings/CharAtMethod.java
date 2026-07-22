package com.strings;

public class CharAtMethod {
	 public static void main(String[] args) {
	        String text = "Java charAt Example";

	        // Print the original string
	        System.out.println("Text: " + text);

	        // Access characters by index using charAt
	        System.out.println("Character at index 0: " + text.charAt(0));
	        System.out.println("Character at index 5: " + text.charAt(5));

	        // Loop through all characters
	        System.out.print("All characters: ");
	        for (int i = 0; i < text.length(); i++) {
	            System.out.print(text.charAt(i));
	                System.out.print(", ");
	        }
	        System.out.println();

	        // Example of using charAt in a condition
	        if (text.charAt(0) == 'J') {
	            System.out.println("The string starts with 'J'.");
	        }
	    }
}
