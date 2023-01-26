package ArraysExample;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the entire array
        System.out.println("Entire Array: " + Arrays.toString(numbers));

        // Print the element at index 2
        System.out.println("Element at index 2: " + numbers[2]);

        // Use for-each loop to print the elements of the array
        System.out.print("Elements in the array: ");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Use the length property to get the length of the array
        System.out.println("Length of the array: " + numbers.length);

        // Use the sort method to sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Use the binarySearch method to search for an element in the array
        int searchKey = 3;
        int index = Arrays.binarySearch(numbers, searchKey);
        System.out.println("Element " + searchKey + " found at index: " + index);

        // Use the fill method to fill the array with a specific value
        Arrays.fill(numbers, 0);
        System.out.println("Array filled with 0s: " + Arrays.toString(numbers));

// Use the copyOf method to create a copy of the array
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copy of the array: " + Arrays.toString(numbersCopy));
        // Use the copyOfRange method to create a copy of a specific range of the array
        int[] numbersRange = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Copy of range 1 to 3: " + Arrays.toString(numbersRange));
        // Use the equals method to compare two arrays
        System.out.println("Are the original and copied arrays equal? " + Arrays.equals(numbers, numbersCopy));
        // Use the asList method to convert an array to a List
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Array converted to List: " + numbersList);
    }
}

