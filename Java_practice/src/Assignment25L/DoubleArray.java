package Assignment25L;

import java.util.Arrays;
import java.util.function.ToDoubleFunction;

public class DoubleArray {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.7, 3.2, 4.9, 5.1};
        
        ToDoubleFunction<double[]> sum = arr -> Arrays.stream(arr).sum();
        ToDoubleFunction<double[]> max = arr -> Arrays.stream(arr).max().orElse(Double.NaN);
        ToDoubleFunction<double[]> min = arr -> Arrays.stream(arr).min().orElse(Double.NaN);
        ToDoubleFunction<double[]> average = arr -> Arrays.stream(arr).average().orElse(Double.NaN);
        
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum.applyAsDouble(numbers));
        System.out.println("Max: " + max.applyAsDouble(numbers));
        System.out.println("Min: " + min.applyAsDouble(numbers));
        System.out.println("Average: " + average.applyAsDouble(numbers));
    }
}