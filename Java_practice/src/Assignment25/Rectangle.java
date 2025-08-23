package Assignment25;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width > 0 ? width : 1.0;
        this.height = height > 0 ? height : 1.0;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : this.width;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : this.height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayDetails() {
        System.out.println("Rectangle: Width=" + width + ", Height=" + height + 
                          ", Area=" + getArea() + ", Perimeter=" + getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(-2.0, 4.0); // Invalid width
        System.out.println("Testing Rectangle 1:");
        rect1.displayDetails();
        System.out.println("Testing Rectangle 2 (invalid width):");
        rect2.displayDetails();
        rect1.setHeight(6.0);
        System.out.println("After updating height of Rectangle 1:");
        rect1.displayDetails();
    }
}
