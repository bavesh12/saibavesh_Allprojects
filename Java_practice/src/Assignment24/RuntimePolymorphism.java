package Assignment24;


class autoMobile {
    autoMobile() {
        System.out.println("Vehicle Created");
    }

    void start() {
        System.out.println("Vehicle starting");
    }
}

class Bike extends autoMobile {
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
        autoMobile bike = new Bike();
        bike.start();
    }
}
