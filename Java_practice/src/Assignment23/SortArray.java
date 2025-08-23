package Assignment23;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 1, 9 };
		Arrays.sort(arr); // Sorts the array in ascending order

		System.out.println("Array sorted in ascending order:");

		for (int element : arr) {
			System.out.print(element + " ");
		}
	}
}
