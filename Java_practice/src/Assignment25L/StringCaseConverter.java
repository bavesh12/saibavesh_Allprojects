package Assignment25L;

import java.util.function.Function;

public class StringCaseConverter {
    public static void main(String[] args) {
        Function<String, String> toUpper = s -> s.toUpperCase();
        Function<String, String> toLower = s -> s.toLowerCase();
        
        String test = "HeLLo WoRLd";
        System.out.println("Original: " + test);
        System.out.println("To Uppercase: " + toUpper.apply(test));
        System.out.println("To Lowercase: " + toLower.apply(test));
    }
}