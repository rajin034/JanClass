package codingProblems;

import java.util.PriorityQueue;

public class PriorityQueueproblem {
    public static void main(String[] args) {
        int[] nums = {5,8,9,13,20,3};
        int k = 3;

        // Initialize a min heap with a size of k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // Add the first k elements to the min heap
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        // Iterate through the rest of the array and add the element to the min heap
        // if it is larger than the smallest element in the min heap
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        // The k largest elements are now in the min heap
        System.out.println("The k largest elements are: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
