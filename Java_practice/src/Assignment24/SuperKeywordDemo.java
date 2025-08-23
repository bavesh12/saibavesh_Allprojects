package Assignment24;


class automobile {
    String brand = "Generic";

    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends automobile {
    String brand = "Toyota";

    void display() {
        super.display();
        System.out.println("Car Brand: " + brand);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}
