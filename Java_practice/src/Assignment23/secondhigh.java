package Assignment23;

public class secondhigh {
	public static void main(String[] args) {
		float[] per = { 86.7f, 98.7f, 79f, 54f, 52f, 35f, 94f, 66f, 77f, 88f };
		float first = Float.MIN_VALUE;
		float second = Float.MIN_VALUE;

		for (float element : per) {
			if (element > first) {
				second = first;
				first = element;
			} else if (element > second && element != first) {
				second = element;
			}
		}

		System.out.println("Second highest percentage = " + second);
	}

}
