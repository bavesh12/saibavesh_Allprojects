package Assignment23;

public class firstnlast {
	public static void main(String[] args) {
		String input = "java";
		boolean result = input.toLowerCase().startsWith("j") && input.toLowerCase().endsWith("a");
		System.out.println("Does \"" + input + "\" start with 'j' and end with 'a'? " + result);
	}
}
