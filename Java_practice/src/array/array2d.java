package array;

public class array2d {
	public static void main(String[] args) {

		int[][][] arr = new int[2][3][3];

		// Example: print a value if needed
		// System.out.println(arr[1][2][2]); // 30 (if values were initialized)

		for (int[][] element : arr) {
			for (int[] element2 : element) {
				for (int element3 : element2) {
					System.out.print(element3 + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
