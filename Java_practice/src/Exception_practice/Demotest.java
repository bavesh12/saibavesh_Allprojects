package Exception_practice;

public class Demotest {
	void add(int a, int b)
	{
		int sum = a +b;
		System.out.println("Addition="+sum);
	}
	void div(int a,int b) throws ArithmeticException{
		int div = a/b;
		System.out.println("Divvision=");
	}
	public static void main(String[] args) {
		Demotest d = new Demotest();
		d.add(10,20);
		d.div(100,0);
	}
}
