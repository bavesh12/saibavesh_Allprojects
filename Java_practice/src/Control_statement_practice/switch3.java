package Control_statement_practice;

public class switch3 {
	public static void main(String[] args) {
		int a = 30;
		int b = 34;
		char op = '+';
		switch (op) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		default:
			System.out.println("Enter valid input");
		}
	}
}
