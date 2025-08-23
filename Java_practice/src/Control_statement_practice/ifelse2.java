package Control_statement_practice;

public class ifelse2 {
	public static void main(String[] args) {
		int temp = 50;
		if (temp >= 40) {
			System.out.println("Very hot");
		} else if (temp >= 30 && temp < 40) {
			System.out.println("Hot");
		} else if (temp >= 20 && temp <= 29) {
			System.out.println("Warm");
		} else if (temp >= 10 && temp <= 19) {
			System.out.println("Cool");
		} else if (temp <= 10) {
			System.out.println("Very cool");
		}
	}
}
