package com.collections;
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
                
        // 1. add() method - adds element and maintains insertion order
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("After adding elements (maintains order): " + fruits);
        System.out.println("Size: " + fruits.size() + "\n");
        
        // 2. add() with duplicate - LinkedHashSet doesn't store duplicates
        boolean isAdded = fruits.add("Apple");
        System.out.println("'Apple' added: " + isAdded);
        System.out.println("Set after adding duplicate: " + fruits);
        System.out.println("Size remains: " + fruits.size() + "\n");
        
        // 3. addAll() method - adds all elements maintaining insertion order
        LinkedHashSet<String> moreFruits = new LinkedHashSet<>();
        moreFruits.add("Grapes");
        moreFruits.add("Watermelon");
        moreFruits.add("Apple"); // duplicate
        fruits.addAll(moreFruits);
        System.out.println("After addAll: " + fruits);
        System.out.println("Size: " + fruits.size() + "\n");
        
        // 4. Demonstrate insertion order preservation
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        System.out.println("Added in order: 5, 2, 8, 1, 9");
        System.out.println("LinkedHashSet maintains order: " + numbers + "\n");
        
        // 5. contains() method - checks if element exists
        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Contains 'Pineapple': " + fruits.contains("Pineapple") + "\n");
        
        // 6. containsAll() method - checks if all elements exist
        LinkedHashSet<String> checkFruits = new LinkedHashSet<>();
        checkFruits.add("Apple");
        checkFruits.add("Banana");
        System.out.println("Contains all (Apple, Banana): " + fruits.containsAll(checkFruits));
        checkFruits.add("Kiwi");
        System.out.println("Contains all (Apple, Banana, Kiwi): " + fruits.containsAll(checkFruits) + "\n");
        
        // 7. remove() method - removes element from set
        boolean isRemoved = fruits.remove("Banana");
        System.out.println("'Banana' removed: " + isRemoved);
        System.out.println("After remove: " + fruits);
        System.out.println("Size: " + fruits.size() + "\n");
        
        // 8. removeAll() method - removes all specified elements
        LinkedHashSet<String> toRemove = new LinkedHashSet<>();
        toRemove.add("Orange");
        toRemove.add("Mango");
        fruits.removeAll(toRemove);
        System.out.println("After removeAll(Orange, Mango): " + fruits + "\n");
        
        // 9. retainAll() method - keeps only specified elements
        LinkedHashSet<String> tempSet = new LinkedHashSet<>(fruits);
        LinkedHashSet<String> toRetain = new LinkedHashSet<>();
        toRetain.add("Apple");
        toRetain.add("Watermelon");
        tempSet.retainAll(toRetain);
        System.out.println("After retainAll(Apple, Watermelon): " + tempSet + "\n");
        
        // 10. isEmpty() and size() methods
        System.out.println("Is empty: " + fruits.isEmpty());
        System.out.println("Size: " + fruits.size() + "\n");
        
        // 11. clear() method - removes all elements
        LinkedHashSet<String> tempSet2 = new LinkedHashSet<>(fruits);
        tempSet2.clear();
        System.out.println("After clear(): " + tempSet2);
        System.out.println("Is empty: " + tempSet2.isEmpty() + "\n");
        
        // 12. iterator() method - iterates in insertion order
        System.out.println("12. Using iterator() method (maintains insertion order):");
        Iterator<String> iterator = fruits.iterator();
        System.out.print("Iterating: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
        
        // 13. for-each loop
        System.out.println("13. Using for-each loop:");
        System.out.print("Elements in order: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println("\n");
        
        // 14. descendingIterator() - iterate in reverse insertion order
        System.out.println("14. Using descendingIterator() for reverse order:");
        LinkedHashSet<Integer> nums = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.print("Forward order: ");
        for (Integer n : nums) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
        
        // 15. stream() method - Java 8+ stream operations
        System.out.println("15. Using stream() method:");
        System.out.print("Using stream: ");
        fruits.stream().forEach(f -> System.out.print(f + " "));
        System.out.println("\n");
        
        // 16. Comparison: HashSet vs LinkedHashSet
        System.out.println("16. Comparison: HashSet vs LinkedHashSet:");
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(3, 1, 4, 1, 5));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 1, 4, 1, 5));
        
        System.out.println("Input order: 3, 1, 4, 1, 5");
        System.out.println("HashSet (unordered): " + hashSet);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet + "\n");
        
        // 17. LinkedHashSet with custom objects
        System.out.println("17. LinkedHashSet with custom order:");
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Zara");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        System.out.println("Names in insertion order: " + names + "\n");
        
        // 18. Set Operations maintaining order
        System.out.println("18. Set Operations with LinkedHashSet:");
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        
        // Union
        LinkedHashSet<Integer> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union (maintains order): " + union);
        
        // Intersection
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        
        // Difference
        LinkedHashSet<Integer> difference = new LinkedHashSet<>(set2);
        difference.removeAll(set1);
        System.out.println("Difference: " + difference);
    }
}

