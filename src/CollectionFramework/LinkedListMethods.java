package CollectionFramework;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("Original linked list: " + linkedList);

        linkedList.addFirst("Z");
        System.out.println("After adding an element to the front: " + linkedList);

        linkedList.addLast("D");
        System.out.println("After adding an element to the end: " + linkedList);

        String firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement);

        String lastElement = linkedList.getLast();
        System.out.println("Last element: " + lastElement);

        linkedList.removeFirst();
        System.out.println("After removing the first element: " + linkedList);

        linkedList.removeLast();
        System.out.println("After removing the last element: " + linkedList);

        int indexOfB = linkedList.indexOf("B");
        System.out.println("Index of element 'B': " + indexOfB);

        boolean containsB = linkedList.contains("B");
        System.out.println("Linked list contains 'B': " + containsB);
    }
}
