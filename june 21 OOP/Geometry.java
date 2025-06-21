// Geometry class demonstrating method overloading for different shapes
public class Geometry {

    // a) Calculate area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // b) Calculate area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // c) Calculate area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return 0.0; // Optional: handle invalid case
        }
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        Geometry geo = new Geometry();

        // Test case a: Circle
        double circleArea = geo.calculateArea(7.0);  // radius
        System.out.println("Area of Circle: " + circleArea);

        // Test case b: Rectangle
        double rectangleArea = geo.calculateArea(5.0, 4.0);  // length, width
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Test case c: Triangle
        double triangleArea = geo.calculateArea(6.0, 3.0, true);  // base, height, isTriangle
        System.out.println("Area of Triangle: " + triangleArea);
    }
}