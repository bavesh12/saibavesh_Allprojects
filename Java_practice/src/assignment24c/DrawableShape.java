package assignment24c;


interface Drawable {
    void draw();
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius);
    }
}

class Rectangle extends Shape implements Drawable {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with length " + length + " and width " + width);
    }
}

class Triangle extends Shape implements Drawable {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle with base " + base + " and height " + height);
    }
}

public class DrawableShape {
    public static void main(String[] args) {
        Drawable[] shapes = { new Circle(5), new Rectangle(4, 6), new Triangle(3, 4) };
        for (Drawable shape : shapes) {
            shape.draw();
            System.out.println("Area: " + ((Shape)shape).area());
        }
    }
}