package com.basics;

public class NestedIfElseStatemnt {
	public static void main(String[] args) {
		int a=10;		
		if(a>18){
			System.out.println("eligible");
		} else if(a==18){
			System.out.println("also eligible");
		}  else if(a>60){
			System.out.println("also eligible");
		}  else {
			System.out.println("not eligible");
		}
	}
}
