// Abstract class Vehicle
abstract class Vehicle {
    String model;

    Vehicle(String model) {
        this.model = model;
    }

    // Abstract method for calculating rental cost
    abstract double calculateRentalCost(int hours);
}

// Car class
class Car extends Vehicle {
    Car(String model) {
        super(model);
    }

    @Override
    double calculateRentalCost(int hours) {
        double ratePerHour = 20.0; // $20 per hour
        return ratePerHour * hours;
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {
    Motorcycle(String model) {
        super(model);
    }

    @Override
    double calculateRentalCost(int hours) {
        double ratePerHour = 12.0; // $12 per hour
        return ratePerHour * hours;
    }
}

// Bicycle class
class Bicycle extends Vehicle {
    Bicycle(String model) {
        super(model);
    }

    @Override
    double calculateRentalCost(int hours) {
        double ratePerHour = 5.0; // $5 per hour
        return ratePerHour * hours;
    }
}

// Main class to test polymorphism
public class CarRentalSystem {
    public static void main(String[] args) {
        int rentalHours = 3;

        Vehicle car = new Car("Honda Civic");
        Vehicle motorcycle = new Motorcycle("Royal Enfield");
        Vehicle bicycle = new Bicycle("Hero Ranger");

        System.out.println("Rental cost for " + car.model + ": $" + car.calculateRentalCost(rentalHours));
        System.out.println("Rental cost for " + motorcycle.model + ": $" + motorcycle.calculateRentalCost(rentalHours));
        System.out.println("Rental cost for " + bicycle.model + ": $" + bicycle.calculateRentalCost(rentalHours));
    }
}
