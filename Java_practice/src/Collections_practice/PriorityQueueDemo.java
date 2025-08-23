package Collections_practice;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Create a PriorityQueue
        Queue<String> q = new PriorityQueue<>();
        q.add("Apple");
        q.add("Mango");
        q.add("Banana");
        q.add("Watermelon");
        q.add("Kiwi");
        q.add("CustardApple"); // Fixed typo from "CusturdApple"
        
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.poll();
        System.out.println(q);

        
        
        
        // Get head of queue (throws exception if empty)
    /*    System.out.println(q.element());
        
        // Add element with offer()
        q.offer("Banana");
        System.out.println(q);
        
        // Peek at head (returns null if empty)
        System.out.println(q.peek());
        
        // Remove head element
        System.out.println(q.poll());
        System.out.println(q);
        
        // Remove specific element
        q.remove("Kiwi");
        System.out.println(q);*/
    }
}