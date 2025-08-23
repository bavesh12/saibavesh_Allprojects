package assignment24c;


class Vehicle {
    Vehicle() {
        System.out.println("Vehicle Created");
    }

    void start() {
        System.out.println("Vehicle starting");
    }
}

class Bike extends Vehicle {
    Bike() {
        super();
        System.out.println("Bike Created");
    }

    @Override
    void start() {
        System.out.println("Bike starting with kick");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
    }
}
