package com.collections;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> students = new LinkedList<>();
                
        // 1. add() method - adds element to the end
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        System.out.println("After adding elements: " + students);
        System.out.println("Size: " + students.size() + "\n");
        
        // 2. addFirst() method - adds element at the beginning
        students.addFirst("Zara");
        System.out.println("After addFirst('Zara'): " + students + "\n");
        
        // 3. addLast() method - adds element at the end
        students.addLast("Eve");
        System.out.println("After addLast('Eve'): " + students + "\n");
        
        // 4. add(index, element) - adds element at specific index
        students.add(2, "Frank");
        System.out.println("After add(2, 'Frank'): " + students + "\n");
        
        // 5. addAll() method - adds all elements from collection
        LinkedList<String> moreStudents = new LinkedList<>();
        moreStudents.add("Grace");
        moreStudents.add("Henry");
        students.addAll(moreStudents);
        System.out.println("After addAll: " + students + "\n");
        
        // 6. get() method - retrieves element at index
        System.out.println("Element at index 0: " + students.get(0));
        System.out.println("Element at index 3: " + students.get(3));
        System.out.println("Last element (index " + (students.size() - 1) + "): " + students.get(students.size() - 1) + "\n");
        
        // 7. getFirst() and getLast() methods
        System.out.println("First element: " + students.getFirst());
        System.out.println("Last element: " + students.getLast() + "\n");
        
        // 8. set() method - replaces element at index
        String oldValue = students.set(1, "Benjamin");
        System.out.println("Old value at index 1: " + oldValue);
        System.out.println("After set(1, 'Benjamin'): " + students + "\n");
        
        // 9. remove(index) method - removes element by index
        String removed = students.remove(0);
        System.out.println("Removed element at index 0: " + removed);
        System.out.println("After remove(0): " + students + "\n");
        
        // 10. remove(Object) method - removes first occurrence
        boolean isRemoved = students.remove("Frank");
        System.out.println("'Frank' removed: " + isRemoved);
        System.out.println("After removing 'Frank': " + students + "\n");
        
        // 11. removeFirst() and removeLast() methods
        LinkedList<String> tempList = new LinkedList<>(students);
        String first = tempList.removeFirst();
        String last = tempList.removeLast();
        System.out.println("Removed first: " + first);
        System.out.println("Removed last: " + last);
        System.out.println("After removeFirst and removeLast: " + tempList + "\n");
        
        // 12. contains() method - checks if element exists
        System.out.println("Contains 'Bob': " + students.contains("Bob"));
        System.out.println("Contains 'Zara': " + students.contains("Zara") + "\n");
        
        // 13. indexOf() method - returns first occurrence index
        System.out.println("Index of 'Bob': " + students.indexOf("Bob"));
        System.out.println("Index of 'Charlie': " + students.indexOf("Charlie") + "\n");
        
        // 14. isEmpty() and size() methods
        System.out.println("Is LinkedList empty: " + students.isEmpty());
        System.out.println("LinkedList size: " + students.size() + "\n");
        
        // 15. Iteration methods
        Iterator<String> iterator = students.iterator();
        System.out.print("Using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
        
        // 16. Reverse iteration
        Iterator<String> descIterator = students.descendingIterator();
        System.out.print("Reverse order: ");
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
        System.out.println("\n");
        
        // 19. clear() method
        LinkedList<String> tempList2 = new LinkedList<>(students);
        tempList2.clear();
        System.out.println("After clear(): " + tempList2);
        System.out.println("Is empty: " + tempList2.isEmpty());
    }
}

