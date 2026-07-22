package com.strings;

public class EqualsMethod {
	public static void main(String[] args) {
		// String literal vs String object
		String literal = "Hello";
		String objectString = new String("Hello");
		String anotherLiteral = "Hello";

		System.out.println(literal.equals(objectString));
		System.out.println(literal.equals(anotherLiteral));
	}
}
