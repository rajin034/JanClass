package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableIterator {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    // Using Iterable and Iterator
    Iterable<Integer> iterable = numbers;
    Iterator<Integer> iterator = iterable.iterator();
    while (iterator.hasNext()) {
      int number = iterator.next();
      System.out.println(number);
    }
  }
}