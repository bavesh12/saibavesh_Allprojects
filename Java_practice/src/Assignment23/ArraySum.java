package Assignment23;

public class ArraySum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int element : arr) {
			sum += element;
		}
		System.out.println("Sum of array elements: " + sum);
	}
}
