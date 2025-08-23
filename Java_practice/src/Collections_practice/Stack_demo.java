package Collections_practice;

import java.util.Stack;

public class Stack_demo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(2);
        s.push(8);
        s.push(9);
        s.push(3);
        s.push(5);
        
        System.out.println("Original Stack: " + s);
        
        s.pop(); // Remove last element (5)
        System.out.println("After first pop: " + s);
        
        s.pop(); // Remove last element (3)
        System.out.println("After second pop: " + s);
        
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.search(9));
    }
}