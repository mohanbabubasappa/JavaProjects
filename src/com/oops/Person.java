package com.oops;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name; // 'this.name' is the field, 'name' is the parameter
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }

    public void updateName(String name) {
        this.name = name; // assigns parameter name to field name
    }

    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        p.printInfo();           // Name: Alice, age: 25
        p.updateName("Bob");
        p.printInfo();           // Name: Bob, age: 25
    }
}
