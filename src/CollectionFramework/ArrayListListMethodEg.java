package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListListMethodEg {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    
    // add elements to the list
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    
    // size of the list
    System.out.println("Size of list: " + list.size());
    
    // get an element at a specific index
    System.out.println("Element at index 1: " + list.get(1));
    
    // set an element at a specific index
    list.set(1, "Mango");
    System.out.println("Element at index 1 after set: " + list.get(1));
    
    // add an element at a specific index
    list.add(2, "Grapes");
    System.out.println("Elements in the list after adding at index 2: " + list);
    
    // remove an element by value
    list.remove("Apple");
    System.out.println("Elements in the list after removing value 'Apple': " + list);
    
    // remove an element by index
    list.remove(1);
    System.out.println("Elements in the list after removing index 1: " + list);
    
    // check if list contains a specific value
    System.out.println("Does list contain value 'Grapes'? " + list.contains("Grapes"));
    
    // get the index of a specific value
    System.out.println("Index of value 'Cherry': " + list.indexOf("Cherry"));
    
    // check if list is empty
    System.out.println("Is the list empty? " + list.isEmpty());
  }
}
