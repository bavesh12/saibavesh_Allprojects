package Assignment26Eh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        try {
            // Open file
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            // Parse first line as integer
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            // Divide by the parsed number
            int result = 100 / number;
            System.out.println("Result: " + result);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } finally {
            System.out.println("Execution completed");
        }
    }
}