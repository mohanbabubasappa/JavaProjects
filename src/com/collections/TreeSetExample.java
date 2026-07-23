package com.collections;
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Integers (sorted in ascending order)
        TreeSet<Integer> numbers = new TreeSet<>();
        
        System.out.println("=== TreeSet Methods Example ===\n");
        
        // 1. add() method - adds element in sorted order
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(40);
        System.out.println("Added: 50, 20, 80, 10, 40");
        System.out.println("TreeSet (automatically sorted): " + numbers);
        System.out.println("Size: " + numbers.size() + "\n");
        
        // 2. add() with duplicate - TreeSet doesn't store duplicates
        boolean isAdded = numbers.add(20);
        System.out.println("20 added: " + isAdded);
        System.out.println("TreeSet after duplicate: " + numbers + "\n");
        
        // 3. addAll() method - adds all elements in sorted order
        TreeSet<Integer> moreNumbers = new TreeSet<>(Arrays.asList(35, 65, 15, 90));
        numbers.addAll(moreNumbers);
        System.out.println("After addAll(35, 65, 15, 90): " + numbers + "\n");
        
        // 4. first() method - returns smallest element
        System.out.println("First (smallest) element: " + numbers.first() + "\n");
        
        // 5. last() method - returns largest element
        System.out.println("5. Using last() method:");
        System.out.println("Last (largest) element: " + numbers.last() + "\n");
        
        // 6. contains() method - checks if element exists
        System.out.println("6. Using contains() method:");
        System.out.println("Contains 50: " + numbers.contains(50));
        System.out.println("Contains 100: " + numbers.contains(100) + "\n");
        
        // 7. remove() method - removes element
        System.out.println("7. Using remove() method:");
        boolean isRemoved = numbers.remove(20);
        System.out.println("20 removed: " + isRemoved);
        System.out.println("After remove(20): " + numbers + "\n");
        
        // 8. removeAll() method - removes all specified elements
        System.out.println("8. Using removeAll() method:");
        TreeSet<Integer> toRemove = new TreeSet<>(Arrays.asList(10, 50));
        numbers.removeAll(toRemove);
        System.out.println("After removeAll(10, 50): " + numbers + "\n");
        
        // 9. retainAll() method - keeps only specified elements
        System.out.println("9. Using retainAll() method:");
        TreeSet<Integer> tempSet = new TreeSet<>(numbers);
        TreeSet<Integer> toRetain = new TreeSet<>(Arrays.asList(15, 40, 80));
        tempSet.retainAll(toRetain);
        System.out.println("After retainAll(15, 40, 80): " + tempSet + "\n");
        
        // 10. isEmpty() and size() methods
        System.out.println("10. Using isEmpty() and size() methods:");
        System.out.println("Is empty: " + numbers.isEmpty());
        System.out.println("Size: " + numbers.size() + "\n");
        
        // 11. clear() method - removes all elements
        System.out.println("11. Using clear() method:");
        TreeSet<Integer> tempSet2 = new TreeSet<>(numbers);
        tempSet2.clear();
        System.out.println("After clear(): " + tempSet2);
        System.out.println("Is empty: " + tempSet2.isEmpty() + "\n");
        
        // 12. headSet() method - returns elements less than specified
        System.out.println("12. Using headSet() method:");
        TreeSet<Integer> freshNumbers = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("TreeSet: " + freshNumbers);
        System.out.println("headSet(40): " + freshNumbers.headSet(40));
        System.out.println("headSet(40, true): " + freshNumbers.headSet(40, true) + "\n");
        
        // 13. tailSet() method - returns elements greater than or equal to specified
        System.out.println("13. Using tailSet() method:");
        System.out.println("tailSet(30): " + freshNumbers.tailSet(30));
        System.out.println("tailSet(30, false): " + freshNumbers.tailSet(30, false) + "\n");
        
        // 14. subSet() method - returns elements within range
        System.out.println("14. Using subSet() method:");
        System.out.println("subSet(20, 40): " + freshNumbers.subSet(20, 40));
        System.out.println("subSet(20, true, 40, true): " + freshNumbers.subSet(20, true, 40, true) + "\n");
        
        // 15. floor() method - returns greatest element <= specified
        System.out.println("15. Using floor() method:");
        System.out.println("floor(35): " + freshNumbers.floor(35));
        System.out.println("floor(25): " + freshNumbers.floor(25) + "\n");
        
        // 16. ceiling() method - returns smallest element >= specified
        System.out.println("16. Using ceiling() method:");
        System.out.println("ceiling(35): " + freshNumbers.ceiling(35));
        System.out.println("ceiling(25): " + freshNumbers.ceiling(25) + "\n");
        
        // 17. lower() method - returns greatest element < specified
        System.out.println("17. Using lower() method:");
        System.out.println("lower(40): " + freshNumbers.lower(40));
        System.out.println("lower(25): " + freshNumbers.lower(25) + "\n");
        
        // 18. higher() method - returns smallest element > specified
        System.out.println("18. Using higher() method:");
        System.out.println("higher(30): " + freshNumbers.higher(30));
        System.out.println("higher(45): " + freshNumbers.higher(45) + "\n");
        
        // 19. pollFirst() method - retrieves and removes first element
        System.out.println("19. Using pollFirst() method:");
        TreeSet<Integer> tempSet3 = new TreeSet<>(freshNumbers);
        Integer first = tempSet3.pollFirst();
        System.out.println("pollFirst(): " + first);
        System.out.println("After pollFirst(): " + tempSet3 + "\n");
        
        // 20. pollLast() method - retrieves and removes last element
        System.out.println("20. Using pollLast() method:");
        Integer last = tempSet3.pollLast();
        System.out.println("pollLast(): " + last);
        System.out.println("After pollLast(): " + tempSet3 + "\n");
        
        // 21. descendingSet() method - returns set in reverse order
        System.out.println("21. Using descendingSet() method:");
        NavigableSet<Integer> descending = freshNumbers.descendingSet();
        System.out.println("Original: " + freshNumbers);
        System.out.println("Descending: " + descending + "\n");
        
        // 22. iterator() method - iterates in ascending order
        System.out.println("22. Using iterator() method (ascending):");
        System.out.print("Ascending order: ");
        Iterator<Integer> iterator = freshNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
        
        // 23. descendingIterator() method - iterates in descending order
        System.out.println("23. Using descendingIterator() method (descending):");
        System.out.print("Descending order: ");
        Iterator<Integer> descIter = freshNumbers.descendingIterator();
        while (descIter.hasNext()) {
            System.out.print(descIter.next() + " ");
        }
        System.out.println("\n");
        
        // 24. TreeSet with Strings (alphabetical order)
        System.out.println("24. TreeSet with Strings (sorted alphabetically):");
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println("Added: Mango, Apple, Banana, Orange, Grapes");
        System.out.println("TreeSet: " + fruits + "\n");
        
        // 25. TreeSet with custom comparator
        System.out.println("25. TreeSet with custom comparator (reverse order):");
        TreeSet<Integer> reverseNumbers = new TreeSet<>(Collections.reverseOrder());
        reverseNumbers.addAll(Arrays.asList(10, 50, 30, 40, 20));
        System.out.println("With reverseOrder comparator: " + reverseNumbers + "\n");
        
        // 26. Comparison with HashSet
        System.out.println("26. Comparison: HashSet vs TreeSet:");
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(5, 2, 8, 1, 9));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(5, 2, 8, 1, 9));
        System.out.println("Input: 5, 2, 8, 1, 9");
        System.out.println("HashSet (unordered): " + hashSet);
        System.out.println("TreeSet (sorted): " + treeSet);
    }
}

