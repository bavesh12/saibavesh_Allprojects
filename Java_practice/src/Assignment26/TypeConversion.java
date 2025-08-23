package Assignment26;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implicit widening
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        double doubleValue = intValue;
        System.out.println("Integer: " + intValue);
        System.out.println("Double (widened): " + doubleValue);

        //explicit narrowing
        System.out.print("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        int castedInt = (int) inputDouble; //truncates decimal
        short castedShort = (short) inputDouble;//may truncate or overflow
        System.out.println("Double: " + inputDouble);
        System.out.println("Casted to int: " + castedInt);
        System.out.println("Casted to short: " + castedShort);

        String intAsString = String.valueOf(intValue);
        System.out.println("Integer as String: " + intAsString);
        try {
            int parsedInt = Integer.parseInt(intAsString);
            System.out.println("Parsed back to int: " + parsedInt);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing String to int: " + e.getMessage());
        }

        scanner.close();
    }
}