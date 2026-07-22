package com.strings;

public class ReverseMethod {
	 public static void main(String[] args) {
	        String text = "Java replace method example";

	        System.out.println("Original text: " + text);

	        // Replace a substring
	        String replaced = text.replace("Java", "Python");
	        System.out.println("After replace: " + replaced);

	        // Replace all occurrences of a character
	        String replaceChar = text.replace('a', 'o');
	        System.out.println("Replace char: " + replaceChar);

	        // Replace first occurrence only
	        String replaceFirst = text.replaceFirst("a", "A");
	        System.out.println("Replace first: " + replaceFirst);

	        // Replace all occurrences using regex
	        String replaceAll = text.replaceAll("method", "function");
	        System.out.println("Replace all: " + replaceAll);
	    }
}
