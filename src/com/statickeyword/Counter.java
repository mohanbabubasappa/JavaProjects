package com.statickeyword;

public class Counter {
    // static variable shared by all Counter objects
    static int totalCount = 0;

    // instance variable unique to each object
    String name;

    public Counter(String name) {
        this.name = name;
        totalCount++;
    }

    // static method can access only static members
    public static int getTotalCount() {
        return totalCount;
    }

    // instance method can access both instance and static members
    public void printInfo() {
        System.out.println(name + " created. Total = " + totalCount);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter("A");
        Counter c2 = new Counter("B");
        c1.printInfo();
        c2.printInfo();

        // call static method without an object
        System.out.println("Total counters: " + Counter.getTotalCount());
    }
}
