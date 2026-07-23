package com.collections;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> marks = new HashMap<>();
        
        System.out.println("=== HashMap Methods Example ===\n");
        
        // 1. put() method - adds key-value pair
        System.out.println("1. Using put() method:");
        marks.put("Alice", 85);
        marks.put("Bob", 92);
        marks.put("Charlie", 78);
        marks.put("David", 88);
        System.out.println("After putting elements: " + marks);
        System.out.println("Size: " + marks.size() + "\n");
        
        // 2. put() with existing key - replaces value
        System.out.println("2. Using put() with existing key:");
        Integer oldValue = marks.put("Alice", 90);
        System.out.println("Old value for 'Alice': " + oldValue);
        System.out.println("After updating Alice's marks: " + marks + "\n");
        
        // 3. putAll() method - adds all key-value pairs from another map
        System.out.println("3. Using putAll() method:");
        HashMap<String, Integer> moreMarks = new HashMap<>();
        moreMarks.put("Eve", 95);
        moreMarks.put("Frank", 82);
        marks.putAll(moreMarks);
        System.out.println("After putAll: " + marks);
        System.out.println("Size: " + marks.size() + "\n");
        
        // 4. putIfAbsent() method - adds only if key doesn't exist
        System.out.println("4. Using putIfAbsent() method:");
        marks.putIfAbsent("Alice", 100);
        System.out.println("After putIfAbsent('Alice', 100): " + marks);
        marks.putIfAbsent("Grace", 88);
        System.out.println("After putIfAbsent('Grace', 88): " + marks + "\n");
        
        // 5. get() method - retrieves value by key
        System.out.println("5. Using get() method:");
        Integer aliceMarks = marks.get("Alice");
        System.out.println("Alice's marks: " + aliceMarks);
        System.out.println("Henry's marks (not present): " + marks.get("Henry") + "\n");
        
        // 6. getOrDefault() method - returns default if key not found
        System.out.println("6. Using getOrDefault() method:");
        Integer henryMarks = marks.getOrDefault("Henry", 0);
        System.out.println("Henry's marks (default 0): " + henryMarks);
        System.out.println("Bob's marks (key exists): " + marks.getOrDefault("Bob", 0) + "\n");
        
        // 7. containsKey() method - checks if key exists
        System.out.println("7. Using containsKey() method:");
        System.out.println("Contains 'Alice': " + marks.containsKey("Alice"));
        System.out.println("Contains 'Henry': " + marks.containsKey("Henry") + "\n");
        
        // 8. containsValue() method - checks if value exists
        System.out.println("8. Using containsValue() method:");
        System.out.println("Contains value 90: " + marks.containsValue(90));
        System.out.println("Contains value 100: " + marks.containsValue(100) + "\n");
        
        // 9. remove(key) method - removes key-value pair by key
        System.out.println("9. Using remove(key) method:");
        Integer removedValue = marks.remove("Grace");
        System.out.println("Removed value for 'Grace': " + removedValue);
        System.out.println("After remove('Grace'): " + marks + "\n");
        
        // 10. remove(key, value) method - removes only if key-value match
        System.out.println("10. Using remove(key, value) method:");
        boolean isRemoved = marks.remove("Bob", 92);
        System.out.println("Removed 'Bob' with value 92: " + isRemoved);
        System.out.println("After remove('Bob', 92): " + marks);
        
        isRemoved = marks.remove("Charlie", 100);
        System.out.println("Removed 'Charlie' with value 100: " + isRemoved + "\n");
        
        // 11. clear() method - removes all entries
        System.out.println("11. Using clear() method:");
        HashMap<String, Integer> tempMap = new HashMap<>(marks);
        tempMap.clear();
        System.out.println("After clear(): " + tempMap);
        System.out.println("Is empty: " + tempMap.isEmpty() + "\n");
        
        // 12. isEmpty() and size() methods
        System.out.println("12. Using isEmpty() and size() methods:");
        System.out.println("Is empty: " + marks.isEmpty());
        System.out.println("Size: " + marks.size() + "\n");
        
        // 13. keySet() method - returns all keys
        System.out.println("13. Using keySet() method:");
        Set<String> keys = marks.keySet();
        System.out.println("All keys: " + keys);
        System.out.print("Iterate keys: ");
        for (String key : keys) {
            System.out.print(key + " ");
        }
        System.out.println("\n");
        
        // 14. values() method - returns all values
        System.out.println("14. Using values() method:");
        Collection<Integer> values = marks.values();
        System.out.println("All values: " + values);
        System.out.print("Iterate values: ");
        for (Integer value : values) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
        
        // 15. entrySet() method - returns key-value pairs
        System.out.println("15. Using entrySet() method:");
        Set<Map.Entry<String, Integer>> entries = marks.entrySet();
        System.out.println("All entries: " + entries);
        System.out.print("Iterate entries: ");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println("\n");
        
        // 16. replace() method - replaces value for existing key
        System.out.println("16. Using replace() method:");
        Integer replacedValue = marks.replace("Alice", 95);
        System.out.println("Old value for 'Alice': " + replacedValue);
        System.out.println("After replace('Alice', 95): " + marks + "\n");
        
        // 17. replace(key, oldValue, newValue) - replaces only if old value matches
        System.out.println("17. Using replace(key, oldValue, newValue) method:");
        boolean isReplaced = marks.replace("Bob", 92, 94);
        System.out.println("Replaced 'Bob' 92 with 94: " + isReplaced);
        
        isReplaced = marks.replace("Charlie", 78, 80);
        System.out.println("Replaced 'Charlie' 78 with 80: " + isReplaced);
        System.out.println("After replace operations: " + marks + "\n");
        
        // 18. HashMap with different data types
        System.out.println("18. HashMap with different key-value types:");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(4, "David");
        System.out.println("Student HashMap: " + students + "\n");
        
        // 19. Iterating using iterator()
        System.out.println("19. Iterating using iterator():");
        Iterator<Map.Entry<String, Integer>> iterator = marks.entrySet().iterator();
        System.out.print("Using iterator: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println("\n");
        
        // 20. Using forEach() with lambda (Java 8+)
        System.out.println("20. Using forEach() with lambda:");
        System.out.print("Using forEach: ");
        marks.forEach((key, value) -> System.out.print(key + "=" + value + " "));
        System.out.println("\n");
        
        // 21. Nested HashMap example
        System.out.println("21. Nested HashMap example:");
        HashMap<String, HashMap<String, Integer>> classMarks = new HashMap<>();
        
        HashMap<String, Integer> class1 = new HashMap<>();
        class1.put("Alice", 85);
        class1.put("Bob", 92);
        
        HashMap<String, Integer> class2 = new HashMap<>();
        class2.put("Charlie", 78);
        class2.put("David", 88);
        
        classMarks.put("Class1", class1);
        classMarks.put("Class2", class2);
        System.out.println("Nested HashMap: " + classMarks);
        System.out.println("Class1: " + classMarks.get("Class1"));
        System.out.println("Alice's marks: " + classMarks.get("Class1").get("Alice"));
    }
}

