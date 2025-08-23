package Assignment26;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for Celsius temperature
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        int fahrenheitInt = (int) fahrenheit; // Cast to int, truncates decimal

        // Print results
        System.out.println("Fahrenheit (double): " + fahrenheit);
        System.out.println("Fahrenheit (int, truncated): " + fahrenheitInt);
        // Note: Casting to int truncates the decimal part, losing precision
        // (e.g., 98.6 becomes 98).

        scanner.close();
    }
}