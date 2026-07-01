class Circle {

    double radius;

    // Default Constructor
    Circle() {
        this(5);
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius = " + radius);
    }
}

public class CircleDemo {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(10);

        c1.display();
        c2.display();
    }
}
