package Encap_Poly;
import java.util.ArrayList;

// Interface for Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract Employee class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary + ", Department: " + department + ", Total Salary: " + calculateSalary());
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee implements Department {
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Full-Time Employee Department: " + getDepartment();
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Part-Time Employee Department: " + getDepartment();
    }
}

// Demo
public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(101, "Alice", 50000, 10000);
        PartTimeEmployee pte = new PartTimeEmployee(102, "Bob", 20000, 80, 200);

        fte.assignDepartment("HR");
        pte.assignDepartment("Support");

        employees.add(fte);
        employees.add(pte);

        // Polymorphism: process and display details using Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
