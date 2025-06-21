// Abstract class for Menu Items
abstract class MenuItem {
    String name;

    MenuItem(String name) {
        this.name = name;
    }

    // Abstract methods for preparation and serving
    abstract void prepare();
    abstract void serve();
}

// Appetizer class
class Appetizer extends MenuItem {
    Appetizer(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Preparing appetizer: " + name + " (Chopping and seasoning)");
    }

    @Override
    void serve() {
        System.out.println("Serving appetizer: " + name + " with dipping sauce.\n");
    }
}

// Main Course class
class MainCourse extends MenuItem {
    MainCourse(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Preparing main course: " + name + " (Cooking and garnishing)");
    }

    @Override
    void serve() {
        System.out.println("Serving main course: " + name + " with sides.\n");
    }
}

// Beverage class
class Beverage extends MenuItem {
    Beverage(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Preparing beverage: " + name + " (Mixing and chilling)");
    }

    @Override
    void serve() {
        System.out.println("Serving beverage: " + name + " in a glass with ice.\n");
    }
}

// Main class to test polymorphism
public class RestaurantOrderingSystem {
    public static void main(String[] args) {
        // Array of different menu items
        MenuItem[] order = {
            new Appetizer("Spring Rolls"),
            new MainCourse("Grilled Chicken"),
            new Beverage("Lemonade")
        };

        // Process each item in the order
        for (MenuItem item : order) {
            item.prepare();  // Dynamic dispatch
            item.serve();    // Polymorphic behavior
        }
    }
}