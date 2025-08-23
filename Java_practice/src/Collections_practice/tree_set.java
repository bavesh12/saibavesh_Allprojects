package Collections_practice;

import java.util.TreeSet;

public class tree_set {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("MAggi");
        set.add("Pasta");
        set.add("Salt");
        set.add("Chocolate");
        set.add("Water");
        set.add("Water");  // Duplicate won't be added
        set.add("Yippi");
        
        System.out.println(set);
        System.out.println(set.clone());
        System.out.println(set.contains("Pasta"));
        
        // ceiling() and floor() examples
        System.out.println(set);
        System.out.println(set.ceiling("Waters")); // Returns next higher
        System.out.println(set.floor("Waters"));     // Returns previous lower
        System.out.println(set.higher("Salt"));
        System.out.println(set.lower("Salt"));
        set.pollFirst();
        System.out.println(set);
        set.pollLast();
        System.out.println(set);
        System.out.print(set.descendingSet());
    }
}
