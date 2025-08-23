package Assignment23;

public class vowels {
	public static void main(String[] args) {
		String input = "obullesh";
		int vowelCount = 0;
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		System.out.println("Number of vowels: " + vowelCount);
	}
}
