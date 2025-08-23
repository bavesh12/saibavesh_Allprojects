package Assignment23;

public class Count2 {
	public static void main(String[] args) {
		String input = "good! morning everyone ";
		int digits = 0, letters = 0, spaces = 0, special = 0;
		for (char ch : input.toCharArray()) {
			if (Character.isDigit(ch)) {
				digits++;
			} else if (Character.isLetter(ch)) {
				letters++;
			} else if (Character.isWhitespace(ch)) {
				spaces++;
			} else {
				special++;
			}
		}
		System.out.println("Digits: " + digits);
		System.out.println("Letters: " + letters);
		System.out.println("Spaces: " + spaces);
		System.out.println("Special characters: " + special);
	}
}
