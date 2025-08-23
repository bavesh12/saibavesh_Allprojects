package Assignment25;
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    private double x, y;
    private final double xSpeed, ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter methods for xSpeed and ySpeed
    public double getXSpeed() {
        return xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() { y += ySpeed; }
    @Override
    public void moveDown() { y -= ySpeed; }
    @Override
    public void moveLeft() { x -= xSpeed; }
    @Override
    public void moveRight() { x += xSpeed; }

    @Override
    public String toString() {
        return "Point[x=" + x + ", y=" + y + "]";
    }
}

class MovableCircle implements Movable {
    private final double radius;
    private final MovablePoint center;

    public MovableCircle(double radius, MovablePoint center) {
        this.radius = radius > 0 ? radius : 1.0;
        this.center = center;
    }

    @Override
    public void moveUp() { center.moveUp(); }
    @Override
    public void moveDown() { center.moveDown(); }
    @Override
    public void moveLeft() { center.moveLeft(); }
    @Override
    public void moveRight() { center.moveRight(); }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", center=" + center + "]";
    }
}

class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.getXSpeed() != bottomRight.getXSpeed() || topLeft.getYSpeed() != bottomRight.getYSpeed()) {
            throw new IllegalArgumentException("Points must have same speed");
        }
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveUp() { topLeft.moveUp(); bottomRight.moveUp(); }
    @Override
    public void moveDown() { topLeft.moveDown(); bottomRight.moveDown(); }
    @Override
    public void moveLeft() { topLeft.moveLeft(); bottomRight.moveLeft(); }
    @Override
    public void moveRight() { topLeft.moveRight(); bottomRight.moveRight(); }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}

public class MovableShapes_Interface {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        MovableCircle circle = new MovableCircle(5, new MovablePoint(10, 10, 2, 2));
        MovableRectangle rect = new MovableRectangle(
            new MovablePoint(0, 10, 1, 1),
            new MovablePoint(10, 0, 1, 1)
        );

        System.out.println("Initial Point: " + point);
        point.moveRight();
        System.out.println("After moveRight: " + point);
        
        System.out.println("\nInitial Circle: " + circle);
        circle.moveUp();
        System.out.println("After moveUp: " + circle);
        
        System.out.println("\nInitial Rectangle: " + rect);
        rect.moveLeft();
        System.out.println("After moveLeft: " + rect);

        // Test invalid rectangle creation
        try {
            MovableRectangle invalidRect = new MovableRectangle(
                new MovablePoint(0, 0, 1, 1),
                new MovablePoint(10, 10, 2, 2) // Different speeds
            );
        } catch (IllegalArgumentException e) {
            System.out.println("\nError creating rectangle: " + e.getMessage());
        }
    }
}