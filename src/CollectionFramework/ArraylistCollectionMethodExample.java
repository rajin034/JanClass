package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class ArraylistCollectionMethodExample {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        // adding elements to the collection
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // size method
        System.out.println("Size of collection: " + numbers.size());

        // isEmpty method
        System.out.println("Is collection empty: " + numbers.isEmpty());

        // contains method
        System.out.println("Does collection contain 3: " + numbers.contains(3));

        // toArray method
        Object[] numArray = numbers.toArray();
        System.out.println("Elements in array: ");
        for (Object num : numArray) {
            System.out.print(num + " ");
        }

        // addAll method
        Collection<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(5);
        newNumbers.add(6);
        numbers.addAll(newNumbers);
        System.out.println("\nElements in collection after addAll: " + numbers);

        // remove method
        numbers.remove(3);
        System.out.println("Elements in collection after remove: " + numbers);

        // removeAll method
        numbers.removeAll(newNumbers);
        System.out.println("Elements in collection after removeAll: " + numbers);

        // clear method
        numbers.clear();
        System.out.println("Elements in collection after clear: " + numbers);
    }
}
