package StreamApiExamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Intermediate and terminal operations on a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

        // Intermediate operations: filter, map, sorted
        List<String> filteredNames = names.stream()
                                           .filter(name -> name.length() > 4)
                                           .map(name -> name.toUpperCase())
                                           .sorted()
                                           .collect(Collectors.toList());
        System.out.println("Filtered names: " + filteredNames);

        // Terminal operations: count, max, reduce
        long count = names.stream().filter(name -> name.length() > 4).count();
        System.out.println("Number of names with length > 4: " + count);

        String maxName = names.stream().max(String::compareTo).orElse("None");
        System.out.println("Max name: " + maxName);

        String concatenatedNames = names.stream().reduce("", (a, b) -> a + ", " + b);
        System.out.println("Concatenated names: " + concatenatedNames);

        // Example 2: Intermediate and terminal operations on a Set
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5);

        // Intermediate operations: filter, map, sorted
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(number -> number % 2 == 0)
                                            .map(number -> number * 2)
                                            .sorted()
                                            .collect(Collectors.toList());
        System.out.println("Even numbers (doubled and sorted): " + evenNumbers);

        // Terminal operations: allMatch, anyMatch, noneMatch
        boolean allEven = numbers.stream().allMatch(number -> number % 2 == 0);
        System.out.println("Are all numbers even? " + allEven);

        boolean anyEven = numbers.stream().anyMatch(number -> number % 2 == 0);
        System.out.println("Are any numbers even? " + anyEven);

        boolean noneNegative = numbers.stream().noneMatch(number -> number < 0);
        System.out.println("Are all numbers non-negative? " + noneNegative);

        // Example 3: Intermediate and terminal operations on a Map
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 40);

        // Intermediate operations: filter, map, sorted
        List<String> oldPeople = ages.entrySet().stream()
                                       .filter(entry -> entry.getValue() > 30)
                                       .map(entry -> entry.getKey().toUpperCase())
                                       .sorted()
                                       .collect(Collectors.toList());
        System.out.println("Old people: " + oldPeople);

        // Terminal operations: forEach, forEachOrdered
        ages.entrySet().stream()
                       .forEach(entry -> System.out.println(entry.getKey() + " is " + entry.getValue() + " years old."));

        ages.entrySet().stream()
                       .forEachOrdered(entry -> System.out.println(entry.getKey() + " is " + entry.getValue() + " years old."));
    }
}
