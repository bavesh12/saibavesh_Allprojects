package Assignment24;


class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class FourWheeler extends Vehicle {
    void display() {
        System.out.println("This is a Four Wheeler");
    }
}

class PetrolFourWheeler extends FourWheeler {
    void display() {
        System.out.println("This is a Petrol Four Wheeler");
    }
}

class FiveSeaterPetrolFourWheeler extends PetrolFourWheeler {
    void display() {
        System.out.println("This is a Five Seater Petrol Four Wheeler");
    }
}

class BalenoFiveSeaterPetrolFourWheeler extends FiveSeaterPetrolFourWheeler {
    void display() {
        System.out.println("This is a Baleno Five Seater Petrol Four Wheeler");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BalenoFiveSeaterPetrolFourWheeler baleno = new BalenoFiveSeaterPetrolFourWheeler();
        baleno.display();
    }
}

