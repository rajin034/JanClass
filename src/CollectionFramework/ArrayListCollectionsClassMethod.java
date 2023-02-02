package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionsClassMethod {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(23);
    numbers.add(45);
    numbers.add(67);
    numbers.add(12);

    System.out.println("Original ArrayList: " + numbers);

    Collections.sort(numbers);
    System.out.println("Sorted ArrayList: " + numbers);

    Collections.reverse(numbers);
    System.out.println("Reversed ArrayList: " + numbers);

    int max = Collections.max(numbers);
    System.out.println("Max value: " + max);

    int min = Collections.min(numbers);
    System.out.println("Min value: " + min);

    Collections.fill(numbers, 0);
    System.out.println("Filled ArrayList: " + numbers);
  }
}