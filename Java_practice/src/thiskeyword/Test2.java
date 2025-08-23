package thiskeyword;

public class Test2 {
	void display(Test2 t) {
		System.out.println("Current class obj");
	}
	void show()
	{
		display(this);
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.show();
		Test2 t1;
		t1 = new Test2();
	}
}
