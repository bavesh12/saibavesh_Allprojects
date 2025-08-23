package Control_statement_practice;

public class ifelse {
	public static void main(String[] args) {
		float per = 85.6f;
		if (per >= 75 && per <= 100) {
			System.out.println("Dist");
		} else if (per >= 60 && per < 75) {
			System.out.println("First class");
		} else if (per >= 50 && per < 60) {
			System.out.println("Second class");
		} else if (per >= 40 && per <= 50) {
			System.out.println("Pass class");
		} else if (per >= 0 && per < 40) {
			System.out.println("Fail");
		} else {
			System.out.println("Invalid input");
		}
	}

}
