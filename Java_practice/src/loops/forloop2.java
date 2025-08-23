package loops;

public class forloop2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // i=0, 1, 2, 3, 4, 5=false
			for (int j = i; j < 5; j++) { // j=0, 1, 2, 3, 4, 5=false
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
