// Calculator class demonstrating method overloading
public class Calculator {

    // a) Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // b) Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // c) Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test case a: Two integers
        int result1 = calc.add(10, 20);
        System.out.println("Sum of two integers: " + result1);

        // Test case b: Two doubles
        double result2 = calc.add(5.5, 4.5);
        System.out.println("Sum of two doubles: " + result2);

        // Test case c: Three integers
        int result3 = calc.add(1, 2, 3);
        System.out.println("Sum of three integers: " + result3);
    }
}