package Assignment22;

public class countdigit {
	public static void main(String[] args) {
		int number = 12345;
		int count = 0;

		if (number == 0) {
			count = 1;
		} else {
			while (number > 0) {
				number = number / 10; // truncates the decimal part
				count++; // Increments
			}
		}

		System.out.println("Total digits: " + count);
	}
}
