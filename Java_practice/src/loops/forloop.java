package loops;

public class forloop {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // i=0, 1, 2, 3, 4, 5=false
			for (int j = 0; j <= i; j++) { // j=0, 1, 2, 3, 4, 5=false
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
