package oops;

class Animal1 {
	void eat() {
		System.out.println("Eating");
	}

	void sound() {
		System.out.println("Sound");
	}
}

class Dog extends Animal1 {
	@Override
	void sound() {
		System.out.println("Sound = Barking");
	}
}

class Tiger extends Animal1 {
	@Override
	void eat() {
		System.out.println("Eats = MEat");
	}

	@Override
	void sound() {
		System.out.println("Sound = Roarr");
	}
}

public class Animal {
	public static void main(String[] args) {
		System.out.println("****Dog****");
		Dog max = new Dog();
		max.eat();
		max.sound();
		System.out.println("*****Dog****");
		Tiger shera = new Tiger();
		shera.eat();
		shera.sound();
	}
}
