package lamda;

interface Greeting{
	void sayHello();
}

public class LamdaExample {
	public static void main(String[] args) {
		Greeting greet= () -> System.out.println("Hello students");
	}
}
