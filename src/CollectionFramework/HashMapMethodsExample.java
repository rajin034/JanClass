package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethodsExample {
  public static void main(String[] args) {
    // Creating a HashMap
    HashMap<String, Integer> map = new HashMap<>();

    // Adding key-value pairs to the map
    map.put("Key1", 10);
    map.put("Key2", 20);
    map.put("Key3", 30);
    System.out.println("Original Map: " + map);

    // Check if the map contains a key
    System.out.println("Contains Key1: " + map.containsKey("Key1"));

    // Check if the map contains a value
    System.out.println("Contains value 20: " + map.containsValue(20));

    // Get the value for a given key
    System.out.println("Value for Key2: " + map.get("Key2"));

    // Remove a key-value pair
    map.remove("Key1");
    System.out.println("Map after removing Key1: " + map);

    // Get the size of the map
    System.out.println("Size of the map: " + map.size());

    // Check if the map is empty
    System.out.println("Is map empty: " + map.isEmpty());

    System.out.println( map.values());



    // Clear the map
    map.clear();
    System.out.println("Map after clearing: " + map);
  }
}