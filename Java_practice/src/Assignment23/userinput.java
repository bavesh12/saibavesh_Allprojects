package Assignment23;

import java.util.Scanner;

public class userinput {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to search: ");
		int target = scanner.nextInt();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Number " + target + " found at index " + i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Number " + target + " not found in array");
		}
		scanner.close();
	}
}
