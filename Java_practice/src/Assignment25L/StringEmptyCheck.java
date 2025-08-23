package Assignment25L;

import java.util.function.Predicate;

public class StringEmptyCheck {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        
        System.out.println("Is '' empty? " + isEmpty.test(""));
        System.out.println("Is 'hello' empty? " + isEmpty.test("hello"));
        System.out.println("Is '  ' empty? " + isEmpty.test("  "));
    }
}