package com.collections;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();
                
        // 1. add() method - adds element to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("After adding elements: " + fruits);
        System.out.println("Size: " + fruits.size() + "\n");
        
        // 2. add() with duplicate - HashSet doesn't store duplicates
        boolean isAdded = fruits.add("Apple");
        System.out.println("'Apple' added: " + isAdded);
        System.out.println("Set after adding duplicate: " + fruits);
        System.out.println("Size remains: " + fruits.size() + "\n");
        
        // 3. addAll() method - adds all elements from collection
        HashSet<String> moreFruits = new HashSet<>();
        moreFruits.add("Grapes");
        moreFruits.add("Watermelon");
        moreFruits.add("Apple"); // duplicate
        fruits.addAll(moreFruits);
        System.out.println("After addAll: " + fruits);
        System.out.println("Size: " + fruits.size() + "\n");
        
        // 4. contains() method - checks if element exists
        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Contains 'Pineapple': " + fruits.contains("Pineapple") + "\n");
        
        // 5. containsAll() method - checks if all elements exist
        HashSet<String> checkFruits = new HashSet<>();
        checkFruits.add("Apple");
        checkFruits.add("Banana");
        System.out.println("Contains all (Apple, Banana): " + fruits.containsAll(checkFruits));
        checkFruits.add("Kiwi");
        System.out.println("Contains all (Apple, Banana, Kiwi): " + fruits.containsAll(checkFruits) + "\n");
        
        // 6. remove() method - removes element from set
        boolean isRemoved = fruits.remove("Banana");
        System.out.println("'Banana' removed: " + isRemoved);
        System.out.println("After remove: " + fruits);
        System.out.println("Size: " + fruits.size() + "\n");
        
        // 7. remove() non-existent element
        boolean notRemoved = fruits.remove("Kiwi");
        System.out.println("'Kiwi' removed: " + notRemoved + "\n");
        
        // 8. removeAll() method - removes all specified elements
        HashSet<String> toRemove = new HashSet<>();
        toRemove.add("Orange");
        toRemove.add("Mango");
        fruits.removeAll(toRemove);
        System.out.println("After removeAll(Orange, Mango): " + fruits + "\n");
        
        // 9. retainAll() method - keeps only specified elements
        HashSet<String> tempSet = new HashSet<>(fruits);
        HashSet<String> toRetain = new HashSet<>();
        toRetain.add("Apple");
        toRetain.add("Watermelon");
        tempSet.retainAll(toRetain);
        System.out.println("After retainAll(Apple, Watermelon): " + tempSet + "\n");
        
        // 10. isEmpty() method - checks if set is empty
        System.out.println("Is empty: " + fruits.isEmpty());
        HashSet<String> emptySet = new HashSet<>();
        System.out.println("Empty HashSet isEmpty: " + emptySet.isEmpty() + "\n");
        
        // 11. size() method - returns number of elements
        System.out.println("Current set: " + fruits);
        System.out.println("Size: " + fruits.size() + "\n");
        
        // 12. clear() method - removes all elements
        HashSet<String> tempSet2 = new HashSet<>(fruits);
        tempSet2.clear();
        System.out.println("After clear(): " + tempSet2);
        System.out.println("Is empty: " + tempSet2.isEmpty() + "\n");
        
        // 13. iterator() method - iterates through set
        System.out.println("Iterating through set:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
        
        // 14. for-each loop
        System.out.println("14. Using for-each loop:");
        System.out.print("Elements: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println("\n");
        
        // 15. stream() method - Java 8+ stream operations
        System.out.print("Using stream: ");
        fruits.stream().forEach(f -> System.out.print(f + " "));
        System.out.println("\n");
        
        // 16. HashSet with Integer
        System.out.println("16. HashSet with Integer:");
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicate
        System.out.println("Numbers: " + numbers);
        System.out.println("Size: " + numbers.size() + "\n");
        
        // 17. Difference between HashSet and other sets
        System.out.println("17. Set Operations:");
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        
        // Union
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + union);
        
        // Intersection
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        
        // Difference
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + difference);
    }
}

