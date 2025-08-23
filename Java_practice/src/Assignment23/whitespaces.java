package Assignment23;

public class whitespaces {
	public static void main(String[] args) {
		String input = "This is a test string";
		String result = input.replaceAll("\\s+", "");
		System.out.println("String after removing white spaces: " + result);
	}
}
