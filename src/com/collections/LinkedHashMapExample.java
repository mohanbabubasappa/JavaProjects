package com.collections;
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap with String keys and Integer values (maintains insertion order)
        LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();
        
        System.out.println("=== LinkedHashMap Methods Example ===\n");
        
        // 1. put() method - adds key-value pair maintaining insertion order
        System.out.println("1. Using put() method (maintains insertion order):");
        marks.put("Charlie", 78);
        marks.put("Alice", 85);
        marks.put("David", 88);
        marks.put("Bob", 92);
        System.out.println("Added: Charlie, Alice, David, Bob");
        System.out.println("LinkedHashMap (insertion order): " + marks);
        System.out.println("Size: " + marks.size() + "\n");
        
        // 2. put() with existing key - replaces value but maintains order
        System.out.println("2. Using put() with existing key:");
        Integer oldValue = marks.put("Alice", 90);
        System.out.println("Old value for 'Alice': " + oldValue);
        System.out.println("After updating Alice's marks (order maintained): " + marks + "\n");
        
        // 3. putAll() method - adds all key-value pairs maintaining insertion order
        System.out.println("3. Using putAll() method:");
        LinkedHashMap<String, Integer> moreMarks = new LinkedHashMap<>();
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
        
        // 9. remove() method - removes key-value pair by key
        System.out.println("9. Using remove(key) method:");
        Integer removedValue = marks.remove("Grace");
        System.out.println("Removed value for 'Grace': " + removedValue);
        System.out.println("After remove('Grace'): " + marks);
        System.out.println("Size: " + marks.size() + "\n");
        
        // 10. remove(key, value) method - removes only if key-value match
        System.out.println("10. Using remove(key, value) method:");
        boolean isRemoved = marks.remove("Bob", 92);
        System.out.println("Removed 'Bob' with value 92: " + isRemoved);
        System.out.println("After remove('Bob', 92): " + marks + "\n");
        
        // 11. isEmpty() and size() methods
        System.out.println("11. Using isEmpty() and size() methods:");
        System.out.println("Is empty: " + marks.isEmpty());
        System.out.println("Size: " + marks.size() + "\n");
        
        // 12. clear() method - removes all entries
        System.out.println("12. Using clear() method:");
        LinkedHashMap<String, Integer> tempMap = new LinkedHashMap<>(marks);
        tempMap.clear();
        System.out.println("After clear(): " + tempMap);
        System.out.println("Is empty: " + tempMap.isEmpty() + "\n");
        
        // 13. keySet() method - returns all keys in insertion order
        System.out.println("13. Using keySet() method (insertion order):");
        Set<String> keys = marks.keySet();
        System.out.println("All keys: " + keys);
        System.out.print("Iterate keys: ");
        for (String key : keys) {
            System.out.print(key + " ");
        }
        System.out.println("\n");
        
        // 14. values() method - returns all values in insertion order
        System.out.println("14. Using values() method (insertion order):");
        Collection<Integer> values = marks.values();
        System.out.println("All values: " + values);
        System.out.print("Iterate values: ");
        for (Integer value : values) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
        
        // 15. entrySet() method - returns key-value pairs in insertion order
        System.out.println("15. Using entrySet() method (insertion order):");
        Set<Map.Entry<String, Integer>> entries = marks.entrySet();
        System.out.print("Iterate entries: ");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println("\n");
        
        // 16. replace() method - replaces value for existing key
        System.out.println("16. Using replace() method:");
        Integer replacedValue = marks.replace("Alice", 95);
        System.out.println("Old value for 'Alice': " + replacedValue);
        System.out.println("After replace('Alice', 95) (order maintained): " + marks + "\n");
        
        // 17. forEach() with lambda
        System.out.println("17. Using forEach() with lambda:");
        System.out.print("Using forEach: ");
        marks.forEach((key, value) -> System.out.print(key + "=" + value + " "));
        System.out.println("\n");
        
        // 18. LinkedHashMap with Integer keys
        System.out.println("18. LinkedHashMap with Integer keys:");
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        System.out.println("Student LinkedHashMap (insertion order): " + students + "\n");
        
        // 19. Comparison: HashMap vs LinkedHashMap
        System.out.println("19. Comparison: HashMap vs LinkedHashMap:");
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        String[] input = {"Zebra", "Apple", "Mango", "Banana"};
        for (String item : input) {
            hashMap.put(item, item.length());
            linkedHashMap.put(item, item.length());
        }
        
        System.out.println("Input order: Zebra, Apple, Mango, Banana");
        System.out.println("HashMap (unordered): " + hashMap);
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap + "\n");
        
        // 20. Iterating using iterator()
        System.out.println("20. Iterating using iterator():");
        LinkedHashMap<String, String> cities = new LinkedHashMap<>();
        cities.put("First", "New York");
        cities.put("Second", "London");
        cities.put("Third", "Tokyo");
        cities.put("Fourth", "Paris");
        System.out.println("Cities: " + cities);
        System.out.print("Using iterator: ");
        Iterator<Map.Entry<String, String>> iterator = cities.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println("\n");
        
        // 21.Nested LinkedHashMap
        System.out.println("21. Nested LinkedHashMap example:");
        LinkedHashMap<String, LinkedHashMap<String, Integer>> classMarks = new LinkedHashMap<>();
        
        LinkedHashMap<String, Integer> class1 = new LinkedHashMap<>();
        class1.put("Alice", 85);
        class1.put("Bob", 92);
        
        LinkedHashMap<String, Integer> class2 = new LinkedHashMap<>();
        class2.put("Charlie", 78);
        class2.put("David", 88);
        
        classMarks.put("Class1", class1);
        classMarks.put("Class2", class2);
        System.out.println("Nested LinkedHashMap: " + classMarks);
        System.out.println("Class1: " + classMarks.get("Class1"));
        System.out.println("Class1: " + classMarks.get("Class1").get("Bob"));
    }
}

