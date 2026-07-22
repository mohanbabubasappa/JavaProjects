package com.exceptionhandling;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try start");

            try {
                int[] arr = {1, 2, 3};
                // This will throw ArrayIndexOutOfBoundsException
                System.out.println("arr[5] = " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch handled (AIOOBE): " + e.getMessage());
            } finally {
                System.out.println("Inner finally 1 executed");
            }

            try {
                String s = null;
                // This will throw NullPointerException
                System.out.println("Length: " + s.length());
            } catch (NullPointerException e) {
                System.out.println("Inner catch handled (NPE): " + e.getClass().getSimpleName());
            } finally {
                System.out.println("Inner finally 2 executed");
            }

            System.out.println("Outer try end");
        } catch (Exception e) {
            System.out.println("Outer catch handled: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Outer finally executed");
        }

        System.out.println("Program continues after nested try blocks.");
    }
}

