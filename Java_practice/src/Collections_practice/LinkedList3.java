package Collections_practice;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class LinkedList3 {
    public static void main(String[] args) {
        //1
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");
        
        System.out.println("Original LinkedList: " + linkedList);

        //2
        List<String> arrayList = new ArrayList<>(linkedList);
        
        //3
        System.out.println("Converted ArrayList: " + arrayList);
        
        linkedList.add("Grapes");
        System.out.println("\nAfter modifying LinkedList:");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList: " + arrayList);
    }
}