package assignment24b;


class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }

    static void startVehicle(Vehicle vehicle) {
        vehicle.start();
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starting with key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starting with kick");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck starting with heavy engine");
    }
}

public class VehiclePolymorphism {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();
        Vehicle.startVehicle(car);
        Vehicle.startVehicle(bike);
        Vehicle.startVehicle(truck);
    }
}
