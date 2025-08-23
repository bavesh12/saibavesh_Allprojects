package Collections_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchInArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        
        System.out.println("Fruits List: " + fruits);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit to search: ");
        String searchFruit = sc.nextLine();
        
        if (fruits.contains(searchFruit)) {
            System.out.println(searchFruit + " is found in the list!");
        } else {
            System.out.println(searchFruit + " is NOT found in the list.");
        }
        
        int index = fruits.indexOf(searchFruit);
        if (index != -1) {
            System.out.println("It is at index: " + index);
        }
        // 2
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("\n Array: " + Arrays.toString(fruitsArray));

        // 3
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Orange");
        moreFruits.add("Mango");
        moreFruits.add("Apple");

        List<String> mergedList = new ArrayList<>(fruits);
        for (String fruit : moreFruits) {
            if (!mergedList.contains(fruit)) {
                mergedList.add(fruit);
            }
        }
        System.out.println("\nMerged List(No Duplicates): " + mergedList);
        
    }
}
