package Assignment25;

interface Printer {
    void print(String document);
}

class LaserPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Laser printing: " + document);
    }
}

class InkjetPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Inkjet printing: " + document);
    }
}

public class PrinterSwitch {
    public static void main(String[] args) {
        Printer p = new LaserPrinter();
        p.print("Test Document 1");
        
        p = new InkjetPrinter();
        p.print("Test Document 2");
    }
}