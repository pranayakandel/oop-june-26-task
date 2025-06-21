// Abstract base class for all shapes
abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    // Abstract methods
    abstract void resize(double factor);
    abstract void rotate(double angle);
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void resize(double factor) {
        radius *= factor;
        System.out.println(name + " resized. New radius: " + radius);
    }

    @Override
    void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees (no visible change for circle).");
    }
}

// Square class
class Square extends Shape {
    double side;

    Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    void resize(double factor) {
        side *= factor;
        System.out.println(name + " resized. New side length: " + side);
    }

    @Override
    void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees.");
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    void resize(double factor) {
        base *= factor;
        height *= factor;
        System.out.println(name + " resized. New base: " + base + ", New height: " + height);
    }

    @Override
    void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees.");
    }
}

// Main class to test polymorphism
public class Manipulator {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle A", 5),
            new Square("Square B", 4),
            new Triangle("Triangle C", 3, 6)
        };

        System.out.println("Transforming shapes:\n");

        for (Shape shape : shapes) {
            shape.resize(1.5);
            shape.rotate(45);
            System.out.println();
        }
    }
}
