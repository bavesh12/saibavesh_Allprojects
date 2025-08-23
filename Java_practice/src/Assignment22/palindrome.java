package Assignment22;

public class palindrome {
	public static void main(String[] args) {
		int number = 12321; // Example number
		int originalNumber = number;
		int reversed = 0;

		while (number > 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number / 10;
		}

		if (originalNumber == reversed) {
			System.out.println(originalNumber + " is a palindrome.");
		} else {
			System.out.println(originalNumber + " is not a palindrome.");
		}
	}
}
