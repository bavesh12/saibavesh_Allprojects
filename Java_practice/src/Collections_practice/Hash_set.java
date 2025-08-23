package Collections_practice;
//unordered
//no duplicate values
//store only one  null value
//elements store on the basis of hash code

import java.util.HashSet;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Maggi");
        set.add("Pasta");
        set.add("Salt");
        set.add("Chocolate");
        set.add("Water");
        set.add(null); 
        
        System.out.println("Original HashSet: " + set);
        
        set.add("Maggi"); 
        System.out.println("After adding duplicate 'Maggi': " + set);
        
        System.out.println("Cloned set: " + set.clone());
        
        System.out.println("Contains 'Pasta'? " + set.contains("Pasta"));
        
        set.remove("Water");
        System.out.println("After removing 'Water': " + set);
        
        System.out.println("Set size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());
        
        set.clear();
        System.out.println("After clear: " + set);
    }
}