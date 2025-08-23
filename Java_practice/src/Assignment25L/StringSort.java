package Assignment25L;

import java.util.*;
import java.util.stream.Collectors;

public class StringSort {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "b", "banana", "cherry", "date");
        
        Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        Comparator<String> byAlphabet = String::compareTo;
        
        List<String> sortedByLength = strings.stream()
                                            .sorted(byLength)
                                            .collect(Collectors.toList());
        List<String> sortedByAlphabet = strings.stream()
                                              .sorted(byAlphabet)
                                              .collect(Collectors.toList());
        
        System.out.println("Original strings: " + strings);
        System.out.println("Sorted by length: " + sortedByLength);
        System.out.println("Sorted alphabetically: " + sortedByAlphabet);
    }
}