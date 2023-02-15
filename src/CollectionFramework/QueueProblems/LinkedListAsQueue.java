package CollectionFramework.QueueProblems;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer(200);
        queue.offer(20);
        queue.offer(35);

        System.out.println("Elements in the queue: " + queue);

        // Removing elements from the queue
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Removed element: " + queue.poll());

        System.out.println("Elements in the queue: " + queue);

        // Peeking at the head of the queue
        System.out.println("Head of the queue: " + queue.peek());

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Removing all elements from the queue
        queue.clear();

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}

