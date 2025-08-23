package Assignment22;

public class fib {
	public static void main(String args[]) {
		int n = 10;
		int n1 = 0, n2 = 1;

		for (int i = 0; i <= n; i++) {
			System.out.print(n1 + " ");

			// Swap
			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
		}
	}
}
