package Assignment25L;

import java.util.function.BinaryOperator;

public class MaxMinLambda {
    public static void main(String[] args) {
        // Lambda for Maximum of Two Integers
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;

        // Lambda for Minimum of Two Integers
        BinaryOperator<Integer> min = (a, b) -> a < b ? a : b;

        // Example usage
        int num1 = 10, num2 = 20;
        System.out.println("Max: " + max.apply(num1, num2)); // Output: Max: 20
        System.out.println("Min: " + min.apply(num1, num2)); // Output: Min: 10
    }
}