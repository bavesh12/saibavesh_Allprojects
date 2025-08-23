package Assignment25;

interface Polygon {
    double getArea();
    
    default double getPerimeter(int... sides) {
        double sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }
    
    static String shapeInfo() {
        return "A polygon is a closed shape with straight sides";
    }
}

class Rect implements Polygon {
    private final double width;
    private final double height;

    public Rect(double width, double height) {
        this.width = width > 0 ? width : 1.0;
        this.height = height > 0 ? height : 1.0;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Triangle implements Polygon {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base > 0 ? base : 1.0;
        this.height = height > 0 ? height : 1.0;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class PolygonDemo {
    public static void main(String[] args) {
        Polygon rect = new Rect(4, 5);
        Polygon tri = new Triangle(3, 6);
        
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter(4, 5, 4, 5));
        System.out.println("Triangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter(3, 4, 5));
        System.out.println("Shape Info: " + Polygon.shapeInfo());
    }
}
