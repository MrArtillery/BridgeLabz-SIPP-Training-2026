abstract class Shape {

    public abstract double area();

    public abstract double perimeter();
}

class Circle extends Shape {

    // Encapsulation + Immutability
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter only
    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class ShapeReport {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(7),
                new Rectangle(10, 5),
                new Triangle(3, 4, 5)
        };

        System.out.println("Shape Report");
        System.out.println("-------------------------------");

        for (Shape shape : shapes) {

            System.out.println(shape.getClass().getSimpleName());

            System.out.printf("Area      : %.2f%n", shape.area());

            System.out.printf("Perimeter : %.2f%n", shape.perimeter());

            System.out.println();
        }

        // Getter demonstration
        Circle circle = new Circle(10);

        System.out.println("Circle Radius = " + circle.getRadius());

        // circle.radius = 20; // Not allowed
    }
}
