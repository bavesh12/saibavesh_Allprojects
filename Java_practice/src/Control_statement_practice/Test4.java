package Control_statement_practice;

public class Test4 {
	public static void main(String[] args) {
		int age = 17;
		boolean haveid = true;
		boolean isStudent = true;
		if (age >= 18 && haveid) {
			System.out.println("The person is allowed without any discount");
		} else {
			System.out.println("The person is allowed and gets a student discount");
		}
	}

}
