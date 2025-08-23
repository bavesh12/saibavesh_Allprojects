package array;
//
public class array5 {
	public static void main(String[] args) {
		int[][] matrix = new int[2][5]; // 2 rows, 5 columns
		int a = 1, b = 2, n;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = a;
				n = a + b;
				a = b;
				b = n;
			}
		}

		// Print the matrix
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
