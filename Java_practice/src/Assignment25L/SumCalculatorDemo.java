package Assignment25L;


interface SumCalculator {
    int sum(int a, int b);
}

public class SumCalculatorDemo {
    public static void main(String[] args) {
        SumCalculator adder = (a, b) -> a + b;
        
        System.out.println("Sum of 5 and 3: " + adder.sum(5, 3));
        System.out.println("Sum of -2 and 7: " + adder.sum(-2, 7));
        System.out.println("Sum of 0 and 0: " + adder.sum(0, 0));
    }
}