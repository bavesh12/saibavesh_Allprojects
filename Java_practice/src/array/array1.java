package array;

public class array1 {
	public static void main(String[] args) {
		float[] per = { (float) 86.7, (float) 98.7, 79 };
		float max = per[0];
		for (float element : per) {
			if (element > max) {
				max = element;
			}
		}
		System.out.println("Higest percentage=" + max);
	}
}
