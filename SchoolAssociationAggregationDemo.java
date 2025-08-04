package Object_Oriented;

import java.util.ArrayList;

// Aggregation: School has Students
class School {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("  " + s.getName());
        }
    }
}

// Association: Student can enroll in multiple Courses, Course can have multiple Students
class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("  " + c.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("  " + s.getName());
        }
    }
}

// Demo
public class SchoolAssociationAggregationDemo {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course math = new Course("Mathematics");
        Course sci = new Course("Science");
        Course eng = new Course("English");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(math);
        s1.enrollCourse(sci);

        s2.enrollCourse(math);
        s2.enrollCourse(eng);

        school.showStudents();

        s1.viewCourses();
        s2.viewCourses();

        math.showEnrolledStudents();
        sci.showEnrolledStudents();
        eng.showEnrolledStudents();
    }
}
