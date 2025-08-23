package Assignment25L;
import java.util.function.LongUnaryOperator;

public class calculateFactorial {
    public static void main(String[] args) {
        LongUnaryOperator factorial = n -> {
            if (n < 0) return 0;
            if (n == 0 || n == 1) return 1;
            long result = 1;
            for (long i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        
        System.out.println("Factorial of 0: " + factorial.applyAsLong(0));
        System.out.println("Factorial of 5: " + factorial.applyAsLong(5));
        System.out.println("Factorial of 10: " + factorial.applyAsLong(10));
        System.out.println("Factorial of -1: " + factorial.applyAsLong(-1));
    }
}