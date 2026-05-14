// Abstract class Employee
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateSalary();

    // Normal method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Full Time Employee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee {
    double hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, double hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Gurshan", 101, 50000);
        System.out.println("--- Full Time Employee ---");
        fte.displayDetails();

        PartTimeEmployee pte = new PartTimeEmployee("Rahul", 102, 80, 200);
        System.out.println("\n--- Part Time Employee ---");
        pte.displayDetails();
    }
}
