package Object_Oriented;

import java.util.ArrayList;

// Aggregation: Faculty can exist independently of Department/University
class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String toString() {
        return name + " (" + specialization + ")";
    }
}

// Composition: Department cannot exist without University
class Department {
    private String name;
    private ArrayList<Faculty> faculties = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showFaculties() {
        System.out.println("Department: " + name);
        for (Faculty f : faculties) {
            System.out.println("  " + f);
        }
    }

    public void clearFaculties() {
        faculties.clear();
    }
}

// University class (composition: owns Departments, aggregation: has Faculties)
class University {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Faculties (aggregation):");
        for (Faculty f : faculties) {
            System.out.println("  " + f);
        }
        for (Department dept : departments) {
            dept.showFaculties();
        }
    }

    // When University is deleted, all departments (and their faculties) are deleted
    public void deleteUniversity() {
        for (Department dept : departments) {
            dept.clearFaculties();
        }
        departments.clear();
        System.out.println("University " + name + " and all its departments deleted.");
    }
}

// Demo
public class UniversityComposition {
    public static void main(String[] args) {
        University uni = new University("Global University");

        Faculty f1 = new Faculty("Dr. Alice", "Physics");
        Faculty f2 = new Faculty("Dr. Bob", "Mathematics");
        Faculty f3 = new Faculty("Dr. Carol", "Computer Science");

        Department physics = new Department("Physics");
        Department cs = new Department("Computer Science");

        physics.addFaculty(f1);
        cs.addFaculty(f3);

        uni.addDepartment(physics);
        uni.addDepartment(cs);

        uni.addFaculty(f1); // Aggregation: faculty can exist outside department
        uni.addFaculty(f2); // Aggregation: not assigned to any department
        uni.addFaculty(f3);

        uni.showUniversity();

        // Delete university (composition: all departments/faculties in departments removed)
        uni.deleteUniversity();

        // Faculty f2 still exists independently
        System.out.println("Independent faculty: " + f2);
    }
}
