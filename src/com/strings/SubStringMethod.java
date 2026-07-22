package com.strings;

public class SubStringMethod {
	 public static void main(String[] args) {
		 String text = "Java program example";

		 String part1 = text.substring(5);      // "substring example"
		 String part2 = text.substring(5, 14);  // "substring"

		 System.out.println(part1);
		 System.out.println(part2);
	 }
}
