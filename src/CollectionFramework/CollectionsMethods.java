package CollectionFramework;

import java.util.*;

public class CollectionsMethods {
   public static void main(String[] args) {
      LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
      System.out.println("Original LinkedList: " + linkedList);
      
      // sort method
      Collections.sort(linkedList);
      System.out.println("LinkedList after sorting: " + linkedList);
      
      // reverse method
      Collections.reverse(linkedList);
      System.out.println("LinkedList after reversing: " + linkedList);
      
      // shuffle method
      Collections.shuffle(linkedList);
      System.out.println("LinkedList after shuffling: " + linkedList);
      
      // binarySearch method
      int index = Collections.binarySearch(linkedList, 30);
      System.out.println("Index of 30: " + index);
      
      // max method
      int max = Collections.max(linkedList);
      System.out.println("Max element: " + max);
      
      // min method
      int min = Collections.min(linkedList);
      System.out.println("Min element: " + min);
   }
}
