package scanner;

import java.util.Scanner;

// registration form
public class scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Full name");
		String name = sc.nextLine();
		System.out.println("Enter mobile number");
		long number = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Email Address");
		String email = sc.nextLine();
		System.out.println("Enter username");
		String username = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		System.out.println("confirm password");
		String compass = sc.nextLine();

		System.out.println("Registration details are: ");
		System.out.println("Name            = " + name);
		System.out.println("Mobile number   = " + number);
		System.out.println("Email           = " + email);
		System.out.println("username        = " + username);
		System.out.println("password        = " + password);
		System.out.println("confirm password = " + compass);
	}

}
