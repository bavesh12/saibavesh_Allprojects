package Assignment22;

public class sumofdigits {
	public static void main(String[] args) {
		int number = 6785; // Example number
		int sum = 0;

		while (number > 0) {
			int digit = number % 10; // Get the last digit
			sum += digit; // Add to sum
			number = number / 10; // Remove the last digit
		}

		System.out.println("Sum of digits: " + sum);
	}
}
