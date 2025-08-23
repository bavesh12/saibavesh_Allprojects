package Variable;

public class strings {
	public static void main(String[] args) {
		String st = "Welcome"; // current memory allocation is 19 bits

		System.out.println(st.charAt(2)); // l
		System.out.println(st.codePointAt(1)); // return ascii value
		System.out.println(st.codePointBefore(1));
		System.out.println(st.codePointCount(0, 3));
		System.out.println(st.equals("hello"));
		System.out.println(st.equalsIgnoreCase("Welcome"));

		System.out.println(st.isBlank());
		System.out.println(st.isEmpty());
		System.out.println(st.lastIndexOf("o"));
		System.out.println(st.contains("lo"));
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
	}

}
