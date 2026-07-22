package com.strings;

public class ContainsMethod {
	 public static void main(String[] args) {
	        String text = "Java method";

	        System.out.println(text);
	        System.out.println(text.contains("Java"));
	        System.out.println(text.contains("example"));
	        System.out.println(text.contains("hello"));

	        String word = "Java";
	        if (text.contains(word)) {
	            System.out.println("The text contains the substring: " + word);
	        } else {
	            System.out.println("The text does not contain the substring: " + word);
	        }
	    }
}
