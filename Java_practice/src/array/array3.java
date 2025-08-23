package array;

public class array3 {
	public static void main(String[] args) {
		// col 0 1 2
		// int[][] arr = {{10, 20}, // row 0
		// {30, 40, 50}, // row 1
		// {60}}; // // row 2

		int[][] arr = new int[4][2];

		// System.out.println(arr[1][2]); // This line will throw
		// ArrayIndexOutOfBoundsException
		// System.out.println(arr[2][0]); // 60

		for (int i = 0; i < arr.length; i++) { // len = 3, row = i
			for (int j = 0; j < arr[i].length; j++) { // 2
				System.out.print(arr[i][j] + " ");
				arr[i][j]++;
			}
			System.out.println();
		}

	}
}
