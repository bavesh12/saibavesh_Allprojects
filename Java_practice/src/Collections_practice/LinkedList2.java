package Collections_practice;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        //1
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);
        
        System.out.println("Original LinkedList: " + originalList);

        //2
        LinkedList<Integer> clonedList = new LinkedList<>(originalList);
        System.out.println("Cloned LinkedList: " + clonedList);   
        //3
        
        //originalList.add(50);
        //System.out.println("\nAfter modifying original list:");
        System.out.println("Original LinkedList: " + originalList);
        System.out.println("Cloned LinkedList: " + clonedList);
    }
}