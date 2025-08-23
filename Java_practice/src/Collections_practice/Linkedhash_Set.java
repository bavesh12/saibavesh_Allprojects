package Collections_practice;

import java.util.LinkedList;
import java.util.Iterator;

public class Linkedhash_Set {
    public static void main(String[] args) {
        LinkedList<String> set = new LinkedList<String>();
        set.add("Maggi");
        set.add("Pasta");
        set.add("Salt");
        set.add("Chocolate");
        set.add("Water");
        set.add("Water");
        set.add(null);
        set.add(null);
        
        System.out.println(set);
        System.out.println(set.clone());
        System.out.println(set.contains("Pasta"));
        System.out.println(set.isEmpty());
        System.out.println("First element=" + set.getFirst());
        System.out.println("Last element=" + set.getLast());
        
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

//linked has map has insertion order