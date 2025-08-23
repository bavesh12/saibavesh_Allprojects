package Assignment23;

public class split {
	public static void main(String[] args) {
		String sentence = "Good morning everyone";
		String[] words = sentence.split("\\s+");
		System.out.println("Words in the sentence:");
		for (String word : words) {
			System.out.println(word);
		}
	}
}
