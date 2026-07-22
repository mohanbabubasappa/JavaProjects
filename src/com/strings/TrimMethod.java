package com.strings;

public class TrimMethod {
	 public static void main(String[] args) {
		 String text = "   Java program method   ";
		 String trimmed = text.trim();

		 System.out.println("[" + text + "]");     // [   Java trim method   ]
		 System.out.println("[" + trimmed + "]");  // [Java trim method]
	 }
}
