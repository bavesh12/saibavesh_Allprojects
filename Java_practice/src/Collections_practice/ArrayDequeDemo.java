package Collections_practice;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> q = new ArrayDeque<>();
        // Add elements to the deque
        q.add("Apple");
        q.add("Mango");
        q.add("Watermelon");
        q.add("Kiwi");

        
        System.out.println("Initial Deque: " + q);
        
        // Get first and last elements
        System.out.println("First element: " + q.getFirst());
        System.out.println("Last element: " + q.getLast());
        
        // Add to the end with offer()
        q.offer("Banana");
        System.out.println("After adding Banana: " + q);
        
        // Add to both ends
        q.offerFirst("MuskMelon");
        q.offerLast("Orange");
        System.out.println("After adding to both ends: " + q);
        
        // Peek at head
        System.out.println("Head element (peek): " + q.peek());
        
        // Remove head element
        q.poll();
        System.out.println("After poll(): " + q);
    }
}

//in queue and dequeue accepts duplicates elements