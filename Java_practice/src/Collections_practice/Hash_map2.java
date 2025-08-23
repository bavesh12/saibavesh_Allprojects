package Collections_practice;

import java.util.HashMap;
import java.util.Map;

public class Hash_map2 {
    public static void main(String[] args) {
        // Create HashMap with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();
        
        // Add entries
        map.put(1, " Apple");
        map.put(2, " Banana");
        map.put(3, " Date");
        map.put(4, " Cherry");
        map.put(2, " Blueberry"); // Overwrites previous value for key 2
        System.out.println(map);
        
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        
       
    }
}
