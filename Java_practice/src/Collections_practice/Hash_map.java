package Collections_practice;

import java.util.HashMap;
import java.util.Map;
// unordered
// no duplicate elements allowed it will be override
// store only one null value
//elements stored on basis of key
public class Hash_map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("One", "orange");
        map.put("Four", "Mango");
        map.put("Three", "banana");
        map.put("Five", "watermelon");
        map.put("Ten", "muskmelon");
        map.put("two","kiwi"); // Duplicate key overwrites previous value
        map.put("Nine","kiwi");
        map.put(null, "Nothing");
        map.put(null, null);
        map.put("Nine", "Custardapple");//replace
        System.out.println(map);
        //System.out.println(map.get("Three"));
        
        // Uncomment to test overwriting
        // map.put("Four", 9);
        System.out.println(map);
        map.replace("Nine","Custardapple");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

    }
}