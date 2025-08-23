package Assignment26;

enum Shape {
    CIRCLE {
        @Override
        double area(double... params) {
            if (params.length != 1) throw new IllegalArgumentException("Circle requires radius");
            return Math.PI * params[0] * params[0];
        }
    },
    SQUARE {
        @Override
        double area(double... params) {
            if (params.length != 1) throw new IllegalArgumentException("Square requires side length");
            return params[0] * params[0];
        }
    },
    RECTANGLE {
        @Override
        double area(double... params) {
            if (params.length != 2) throw new IllegalArgumentException("Rectangle requires width and height");
            return params[0] * params[1];
        }
    },
    TRIANGLE {
        @Override
        double area(double... params) {
            if (params.length != 2) throw new IllegalArgumentException("Triangle requires base and height");
            return 0.5 * params[0] * params[1];
        }
    };

    abstract double area(double... params);
}

public class ShapeEnum {
    public static void main(String[] args) {
        // Test each shape with sample inputs
        System.out.printf("Circle area (radius=5): %.2f%n", Shape.CIRCLE.area(5));
        System.out.printf("Square area (side=4): %.2f%n", Shape.SQUARE.area(4));
        System.out.printf("Rectangle area (width=4, height=6): %.2f%n", Shape.RECTANGLE.area(4, 6));
        System.out.printf("Triangle area (base=3, height=8): %.2f%n", Shape.TRIANGLE.area(3, 8));
    }
}