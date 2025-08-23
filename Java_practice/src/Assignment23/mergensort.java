package Assignment23;

import java.util.Arrays;

public class mergensort {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };
		int[] merged = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, merged, 0, arr1.length);
		System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
		Arrays.sort(merged);
		System.out.println("Merged and sorted array:");
		for (int num : merged) {
			System.out.print(num + " ");
		}
	}
}
