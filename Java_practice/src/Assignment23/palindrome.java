package Assignment23;

public class palindrome {
	public static void main(String[] args) {
		String input = "radar";
		String reversed = new StringBuilder(input).reverse().toString();
		boolean isPalindrome = input.equalsIgnoreCase(reversed);
		System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome);
	}
}
