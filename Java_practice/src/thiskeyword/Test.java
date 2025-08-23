package thiskeyword;

public class Test {
	void setname(String name) {
		System.out.println(name);
	}
	void getname()
	{
		this.setname("Mittal shah");
		System.out.println("Welcome to java learning");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.getname();
	}
}
