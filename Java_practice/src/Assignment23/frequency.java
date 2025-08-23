package Assignment23;

public class frequency {
	public static void main(String[] args) {
		String input = "Esports world cup";
		int[] frequency = new int[256];
		for (char ch : input.toCharArray()) {
			frequency[ch]++;
		}
		System.out.println("Character frequencies in \"" + input + "\":");
		for (int i = 0; i < 256; i++) {
			if (frequency[i] > 0) {
				System.out.println("'" + (char) i + "': " + frequency[i]);
			}
		}
	}
}
