package Assignment22;

public class prime {
	public static void main(String[] args) {
		int n = 27;
		boolean isPrime = true;

		if (n <= 1) {
			isPrime = false;
		} else {

			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println("is a prime number");
		} else {
			System.out.println("is not a prime number");
		}
	}
}
