package thiskeyword;

public class Test1 {
	Test1(String name){
		System.out.println(name);
	}
	Test1(){
		this("im from Test1 Paramterized constructor");
		System.out.println("welcome to my space");
	}
	
	public static void main(String[] args)
	{
		Test1 t = new Test1();
	}
}
