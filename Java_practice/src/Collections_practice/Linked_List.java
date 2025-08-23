package Collections_practice;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Linked_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        
        // Adding elements
        list.add(0, "Apple");
        list.add(1, "Mango");
        list.add(2, "Kiwi");
        list.add(3, "Banana");
        System.out.println(list);
        
        // Accessing and modifying elements
        System.out.println(list.get(3));
        list.set(2, "Orange"); // Replace element at index 2
        System.out.println(list);
        
        // Inserting and checking elements
        list.add(3, "Kiwi"); // Add "Kiwi" at index 3
        System.out.println(list);
        
        // List operations
        System.out.println(list.contains("Banana"));
        System.out.println(list.equals("Banana")); // False (compares entire list, not single element)
        System.out.println(list.get(0)); // First element
        System.out.println(list.get(list.size() - 1)); // Last element
        System.out.println(list.indexOf("Kiwi"));
        System.out.println(list.isEmpty());
        
        // Removing elements
        list.remove(0); // Remove by index
        System.out.println(list);
        list.remove("Kiwi"); // Remove by value
        System.out.println(list);
        
        // Reversing the list (Java 21+)
        
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        Iterator<String> itrs = list.listIterator();
        while(itrs.hasNext()) {
        	System.out.println(itrs.next());
        }
        
        //ArrayList<Integer> list1 = new ArrayList<>(List.of(50,70,90,60,30));
        //Collections.sort(list1);
        //System.out.println(list1);
        
    }
}
