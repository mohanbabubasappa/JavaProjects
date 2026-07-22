package com.classandmethods;

public class Animal {
	String name="mohan";
	int age=33;

	public void sayHello() {
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	}

	public int nextYearAge() {
		return age + 1;
	}

	public static void main(String[] args) {
		Animal p1 = new Animal();
		Animal p2 = new Animal();

		p2.sayHello();
		p1.sayHello();

		p1.nextYearAge();
		p2.nextYearAge();
	}

}
