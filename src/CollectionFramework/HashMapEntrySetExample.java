package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntrySetExample {
  public static void main(String[] args) {
    // Create a HashMap
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "Apple");
    map.put(2, "Banana");
    map.put(3, "Cherry");
    map.put(4, "Durian");
    map.put(5, "Elderberry");

    // Use the keySet() method
    System.out.println("Keys in the HashMap: ");
    Set<Integer> keys = map.keySet();
    System.out.println(keys);
    for (Integer key : keys) {
      System.out.println(key);
    }

    // Use the entrySet() method
    System.out.println("\nKey-Value pairs in the HashMap: ");
    Set<Map.Entry<Integer, String>> entries = map.entrySet();
    System.out.println(entries);
    for (Map.Entry<Integer, String> entry : entries) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}