package Assignment25L;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream().filter(isOdd).collect(Collectors.toList());
        
        System.out.println("Original numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}