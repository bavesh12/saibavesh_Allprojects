package Assignment23;

public class rightRotateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2; // Number of rotations
		int n = arr.length;
		System.out.println("Original array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		for (int i = 0; i < k; i++) {
			int last = arr[n - 1];
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		System.out.println("\nArray after right rotation by " + k + ":");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
