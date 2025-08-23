package Control_statement_practice;

public class nested2 {
	public static void main(String[] args) {
		boolean username = true;
		boolean pass = true;
		if (username) {
			if (pass) {
				System.out.println("User can login");
			}
		} else {
			System.out.println("user can't login");
		}
	}
}

/*
 * Homework 1.check if a user can log in first check if Username is correct then
 * check if password is correct
 *
 * 2. write a program for loan approval first check if salary>25000 then check
 * if credit score >=700
 *
 * 3. write a program for driving license eligibility age must be greater than
 * equal to 18 must have passed the driving test
 */