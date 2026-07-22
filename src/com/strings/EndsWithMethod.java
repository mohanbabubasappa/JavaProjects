package com.strings;

public class EndsWithMethod {
	public static void main(String[] args) {
		String text = "Java method";

		System.out.println(text.endsWith("method")); // true
		System.out.println(text.endsWith("Java"));   // false
		System.out.println(text.endsWith("Method")); // false
	}
}
