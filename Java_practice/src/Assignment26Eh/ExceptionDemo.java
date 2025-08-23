package Assignment26Eh;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Division by zero
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        } finally {
            System.out.println("Operation completed.");
        }

        // Array out of bounds
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } finally {
            System.out.println("Operation completed.");
        }
    }
}