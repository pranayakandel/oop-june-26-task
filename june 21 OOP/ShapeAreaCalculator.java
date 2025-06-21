// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double area();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Override area method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area method
    @Override
    double area() {
        return length * width;
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override area method
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Main class to test the polymorphism
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(5, 10);
        Shape s3 = new Triangle(4, 6);

        // Polymorphic behavior
        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
        System.out.println("Area of Triangle: " + s3.area());
    }
}