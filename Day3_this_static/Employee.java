package Day3_this_static;

class Employee {
    private final int id;
    private String name, designation;
    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayInfo() {
        if (this instanceof Employee) {
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Company: " + companyName);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "John", "Manager");
        Employee e2 = new Employee(102, "Sara", "Developer");
        e1.displayInfo();
        e2.displayInfo();
        Employee.displayTotalEmployees();
    }
}

