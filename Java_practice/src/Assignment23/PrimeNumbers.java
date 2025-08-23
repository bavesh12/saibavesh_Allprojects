package Assignment23;

public class PrimeNumbers {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 10, 11, 13, 15 };
		System.out.println("Prime numbers in array:");
		for (int num : arr) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
