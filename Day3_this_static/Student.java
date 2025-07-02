package Day3_this_static;

class Student {
    private final int rollNumber;
    private String name, grade;
    static String universityName = "Global University";
    static int totalStudents = 0;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudent() {
        if (this instanceof Student) {
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade + ", University: " + universityName);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Amit", "A");
        Student s2 = new Student(2, "Priya", "B+");
        s1.displayStudent();
        s2.displayStudent();
        Student.displayTotalStudents();
    }
}

