package Interface;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Draw a Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Draw Square");
    }
}

public class shapes {
    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
        Circle c = new Circle();
        c.draw();
    }
}
