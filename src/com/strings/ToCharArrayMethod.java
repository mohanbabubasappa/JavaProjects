package com.strings;

public class ToCharArrayMethod {
	 public static void main(String[] args) {
		 String text = "Java";
		 char[] chars = text.toCharArray();
	     System.out.println(chars);

		 for (char c : chars) {
		     System.out.println(c);
		 }
	 }
}
