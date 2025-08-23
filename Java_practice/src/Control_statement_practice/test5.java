package Control_statement_practice;

public class test5 {
	public static void main(String[] args) {
		String day = "Sunday";
		if (day == "Sunday" || day == "sunday" || day == "Saturday" || day == "saturday" || day == "Friday") {
			System.out.println("Weekends");
		} else {
			System.out.println("Weekdays");
		}
	}
}
