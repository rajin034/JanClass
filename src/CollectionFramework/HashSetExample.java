package CollectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
   public static void main(String[] args) {
      // create a HashSet
      HashSet<String> set = new HashSet<>();
      // example to show hashcode;
      /*HashSet<String> set = new HashSet<>();
      String name = "rajin";
      String name1 = "rajin";
      System.out.println(name.hashCode());
      System.out.println(name1.hashCode());*/

      // add elements to the HashSet
      set.add("John");
      set.add("Jane");
      set.add("Jim");
      set.add("jonny");

      // iterator to loop through element of set
      System.out.println("Original HashSet: " + set);



      // Iterating over a HashSet using iterator
      Iterator<String> it = set.iterator();
      while (it.hasNext()) {
         System.out.println(it.next());
      }

      // to array method inhashset
      String[] arr = set.toArray(new String[0]);
      System.out.println("Array: " + Arrays.toString(arr));

      // check if an element is present in the HashSet
      System.out.println("Jim is present in the set: " + set.contains("Jim"));

      // remove an element from the HashSet
      set.remove("Jim");

      // check the size of the HashSet
      System.out.println("Size of the set: " + set.size());

      // clear the HashSet
      set.clear();

      // check if the HashSet is empty
      System.out.println("Is the set empty: " + set.isEmpty());
   }
}
