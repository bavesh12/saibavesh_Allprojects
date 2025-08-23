package Assignment23;

import java.util.Arrays;

public class Sortchar {
	public static void main(String[] args) {
		String input = "programming";
		char[] chars = input.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		System.out.println("String sorted alphabetically: " + sorted);
	}
}
