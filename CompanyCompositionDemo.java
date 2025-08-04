package Object_Oriented;

import java.util.ArrayList;

// Employee class (cannot exist without Department)
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String toString() {
        return name + " (" + role + ")";
    }
}

// Department class (cannot exist without Company)
class Department {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(String empName, String role) {
        employees.add(new Employee(empName, role));
    }

    public void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            System.out.println("  " + emp);
        }
    }

    public void clearEmployees() {
        employees.clear();
    }
}

// Company class (composition: owns Departments and Employees)
class Company {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompany() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    // When Company is deleted, all departments and employees are also deleted
    public void deleteCompany() {
        for (Department dept : departments) {
            dept.clearEmployees();
        }
        departments.clear();
        System.out.println("Company " + name + " and all its departments/employees deleted.");
    }
}

// Demo composition
public class CompanyCompositionDemo {
    public static void main(String[] args) {
        Company comp = new Company("Tech Solutions");

        Department dev = new Department("Development");
        dev.addEmployee("Alice", "Developer");
        dev.addEmployee("Bob", "Senior Developer");

        Department hr = new Department("HR");
        hr.addEmployee("Carol", "HR Manager");

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showCompany();

        // Delete company (composition: all departments/employees removed)
        comp.deleteCompany();
    }
}
