package Assignment24;


abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void performFunction();
}

class SmartPhone extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("SmartPhone turning on");
    }

    @Override
    void turnOff() {
        System.out.println("SmartPhone turning off");
    }

    @Override
    void performFunction() {
        System.out.println("SmartPhone: Calling and Browsing");
    }
}

class SmartWatch extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("SmartWatch turning on");
    }

    @Override
    void turnOff() {
        System.out.println("SmartWatch turning off");
    }

    @Override
    void performFunction() {
        System.out.println("SmartWatch: Tracking fitness and time");
    }
}

class SmartSpeaker extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("SmartSpeaker turning on");
    }

    @Override
    void turnOff() {
        System.out.println("SmartSpeaker turning off");
    }

    @Override
    void performFunction() {
        System.out.println("SmartSpeaker: Playing music and responding to voice commands");
    }
}

public class SmartDevicePolymorphism {
    public static void main(String[] args) {
        SmartDevice[] devices = { new SmartPhone(), new SmartWatch(), new SmartSpeaker() };
        for (SmartDevice device : devices) {
            device.turnOn();
            device.performFunction();
            device.turnOff();
            System.out.println();
        }
    }
}
