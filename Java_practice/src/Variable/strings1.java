package Variable;

public class strings1 {
	public static void main(String[] args) {
		String str = "Hello";

		// Convert String to StringBuffer or StringBuilder
		// immutable String to Mutable string
		StringBuffer sb = new StringBuffer(str);
		sb.append(" Dear");
		System.out.println(sb);
		sb.append(" Students");
		System.out.println(sb);

		// Convert StringBuffer/StringBuilder to String
		// mutable to immutable
		StringBuffer sbb = new StringBuffer("Pune");
		String str1 = new String(sbb);
	}
}
