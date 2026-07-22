package com.strings;

public class StartsWithMethod {
	public static void main(String[] args) {
		String text = "Java method";
		System.out.println(text.startsWith("Java"));   // true
		System.out.println(text.startsWith("java"));   // false
		System.out.println(text.startsWith("method")); // false
	}
}