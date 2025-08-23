package Assignment25;

interface BaseVehicle {
    void start();
}

interface AdvancedVehicle extends BaseVehicle {
    void stop();
    boolean refuel(int amount);
}

class Car implements AdvancedVehicle {
    private int fuelLevel;

    public Car(int initialFuel) {
        this.fuelLevel = initialFuel >= 0 ? initialFuel : 0;
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public boolean refuel(int amount) {
        if (amount <= 0) return false;
        fuelLevel += amount;
        return true;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        BaseVehicle base = new Car(50);
        AdvancedVehicle advanced = (Car)base;
        
        base.start();
        advanced.refuel(20);
        advanced.stop();
        
        System.out.println("Fuel level: " + ((Car)advanced).getFuelLevel());
    }
}