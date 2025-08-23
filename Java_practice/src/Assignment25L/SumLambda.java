package Assignment25L;

import java.util.function.BinaryOperator;

public class SumLambda {
    public static void main(String[] args) {
        // Lambda for Sum of Two Integers
        BinaryOperator<Integer> sum = (a, b) -> a + b;

        // Example usage
        int num1 = 10, num2 = 20;
        System.out.println("Sum: " + sum.apply(num1, num2)); // Output: Sum: 30
    }
}