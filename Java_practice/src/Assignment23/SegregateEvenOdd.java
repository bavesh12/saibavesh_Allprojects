package Assignment23;

public class SegregateEvenOdd {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int[] result = new int[n];
		int evenIndex = 0, oddIndex = n - 1;
		for (int num : arr) {
			if (num % 2 == 0) {
				result[evenIndex++] = num;
			} else {
				result[oddIndex--] = num;
			}
		}
		System.out.println("Array after segregating even and odd numbers:");
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
