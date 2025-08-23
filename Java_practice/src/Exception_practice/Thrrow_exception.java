package Exception_practice;

public class Thrrow_exception {
	public static void main(String[] args) {
		String name = null;
		if(name == null) {
			throw new NullPointerException("Name is not mull");
		}
		System.out.println(name.length());
	}
}
