package Control_statement_practice;

public class ifelse3 {
	public static void main(String[] args) {
		float units = 177.7f;
		if (units < 100) {
			System.out.println("Low usage");
		} else if (units >= 100 && units < 299) {
			System.out.println("Medium usage");
		} else if (units >= 300 && units <= 499) {
			System.out.println("High usage");
		} else if (units > 500) {
			System.out.println("Very high usage");
		} else {
			System.out.println("Invalid input");
		}
	}
}

/*
 * units<100-->"Low usage" 100-299-->"Medium usage" 300-499-->"High usage"
 * 500+-->"Very high usage"
 */