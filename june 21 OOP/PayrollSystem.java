// Base class: Employee
class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to calculate salary (base salary only)
    public double calculateSalary() {
        return baseSalary;
    }
}

// Derived class: Manager
class Manager extends Employee {
    double performanceBonus;

    Manager(String name, double baseSalary, double performanceBonus) {
        super(name, baseSalary);
        this.performanceBonus = performanceBonus;
    }

    // Override calculateSalary to include performance bonus
    @Override
    public double calculateSalary() {
        return baseSalary + performanceBonus;
    }
}

// Main class to demonstrate method overriding
public class PayrollSystem {
    public static void main(String[] args) {
        // Regular employee
        Employee emp = new Employee("John Doe", 3000);
        System.out.println("Salary of Employee " + emp.name + ": $" + emp.calculateSalary());

        // Manager with bonus
        Manager mgr = new Manager("Alice Smith", 5000, 1200);
        System.out.println("Salary of Manager " + mgr.name + ": $" + mgr.calculateSalary());
    }
}