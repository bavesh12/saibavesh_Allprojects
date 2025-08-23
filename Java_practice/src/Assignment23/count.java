package Assignment23;

public class count {
	public static void main(String[] args) {
		String sentence = "Good Morning Everyone";
		String[] words = sentence.trim().split("\\s+");
		int wordCount = words.length;
		System.out.println("Number of words: " + wordCount);
	}
}
