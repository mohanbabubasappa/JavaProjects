package com.strings;

public class EqualsOperator {
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String c = new String("Hello");
		String d = new String("Hello");

		System.out.println(a == b);        // usually true (same interned literal)
		System.out.println(a == c);        // false (different object)
		System.out.println(b == c);
		System.out.println(d == c);
	}

}
