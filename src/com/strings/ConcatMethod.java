package com.strings;

public class ConcatMethod {
	public static void main(String[] args) {
        String first = "Hello";
        String second = "World";

        // Concatenate using concat() method
        String concatMethod = first.concat(", ").concat(second).concat("!");
        System.out.println(concatMethod);
    }
}
