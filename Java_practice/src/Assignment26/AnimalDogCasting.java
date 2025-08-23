package Assignment26;

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching");
    }
}

public class AnimalDogCasting {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = d; // Upcasting (implicit)

        a.makeSound(); 

        // Note: a.fetch() would cause a compile-time error because Animal
        // does not have a fetch method.
    }
}