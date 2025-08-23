package Interface;

interface Animal{
	void eat();
	void sound();
	default void show()
	{
		System.out.println("Hello");
	}
}
class Dog implements Animal{
	public void eat() {
		System.out.println("Royal canin");
	}

	public void sound() {
		System.out.println("Barking");
	}
	
}

public class Animal_practice{
	public static void main(String[] args) {
		Dog max = new Dog();
		max.eat();
		max.sound();
	}
}






