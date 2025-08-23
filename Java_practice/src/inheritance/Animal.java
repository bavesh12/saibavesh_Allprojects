package inheritance;

class Animal1 {
	void eat(String eats) {
		System.out.println("Eats=" + eats);
	}

	void sound(String sounds) {
		System.out.println("Sound=" + sounds);
	}
}

class D_animal extends Animal1 {
	void lives(String live) {
		System.out.println("Lives in the " + live);
	}
}

public class Animal {
	public static void main(String[] args) {
		D_animal dog = new D_animal();
		System.out.println("***********Dog*******");
		dog.eat("Royal camin");
		dog.sound("Barking");
		dog.lives("City");
		System.out.println("************cat********");
		D_animal cat = new D_animal();
		cat.eat("cat food");
	}
}