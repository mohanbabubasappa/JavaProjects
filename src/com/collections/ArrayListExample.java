package com.collections;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();
                
        // 1. add() method - adds element to the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("After adding elements: " + fruits);
        System.out.println("Size: " + fruits.size() + "\n");
        
        // 2. add(index, element) - adds element at specific index
        fruits.add(1, "Grapes"); // Inserts at index 1
        System.out.println("After adding 'Grapes' at index 1: " + fruits + "\n");
        
        // 3. addAll() method - adds all elements from another collection
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Watermelon");
        moreFruits.add("Strawberry");
        fruits.addAll(moreFruits);
        System.out.println("After addAll: " + fruits + "\n");
        
        // 4. addAll(index, collection) - adds all elements at specific index
        List<String> tropicalFruits = new ArrayList<>();
        tropicalFruits.add("Pineapple");
        tropicalFruits.add("Coconut");
        fruits.addAll(2, tropicalFruits);
        System.out.println("After addAll at index 2: " + fruits + "\n");
        
        // 5. get() method - retrieves element at specific index
        String elementAtIndex3 = fruits.get(3);
        System.out.println("Element at index 3: " + elementAtIndex3);
        System.out.println("First element: " + fruits.get(0));
        System.out.println("Last element: " + fruits.get(fruits.size() - 1) + "\n");
        
        // 6. set() method - replaces element at specific index
        String oldValue = fruits.set(4, "Papaya");
        System.out.println("Old value at index 4: " + oldValue);
        System.out.println("After set(4, 'Papaya'): " + fruits + "\n");
        
        // 7. remove() method - removes element by index
        String removedElement = fruits.remove(0);
        System.out.println("Removed element: " + removedElement);
        System.out.println("After removing index 0: " + fruits + "\n");
        
        // 8. remove(Object) method - removes first occurrence of element
        boolean isRemoved = fruits.remove("Banana");
        System.out.println("'Banana' removed: " + isRemoved);
        System.out.println("After removing 'Banana': " + fruits + "\n");
        
        // 9. removeAll() method - removes all specified elements
        List<String> toRemove = new ArrayList<>();
        toRemove.add("Grapes");
        toRemove.add("Watermelon");
        fruits.removeAll(toRemove);
        System.out.println("After removeAll(Grapes, Watermelon): " + fruits + "\n");
        
        // 10. contains() method - checks if element exists
        System.out.println("Contains 'Orange': " + fruits.contains("Orange"));
        System.out.println("Contains 'Kiwi': " + fruits.contains("Kiwi") + "\n");
        
        // 11. indexOf() method - returns first occurrence index
        System.out.println("Index of 'Mango': " + fruits.indexOf("Mango"));
        System.out.println("Index of 'Pineapple': " + fruits.indexOf("Pineapple") + "\n");
        
        // 12. isEmpty() and size() methods
        System.out.println("Is ArrayList empty: " + fruits.isEmpty());
        System.out.println("ArrayList size: " + fruits.size() + "\n");
        
        // 13. clear() method - removes all elements
        List<String> tempList = new ArrayList<>(fruits);
        tempList.clear();
        System.out.println("After clear(): " + tempList);
        System.out.println("Is empty after clear: " + tempList.isEmpty());
    }
}

