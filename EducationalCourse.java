package Inheritance;

// Base class
class Course {
    protected String courseName;
    protected int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hours");
    }
}

// Subclass
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass extending OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: ₹" + fee + ", Discount: " + discount + "%");
    }
}

// Demo
public class EducationalCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", 40);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 30, "Coursera", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Data Science", 50, "Udemy", false, 4999, 20);

        c1.displayInfo();
        System.out.println("---");
        c2.displayInfo();
        System.out.println("---");
        c3.displayInfo();
    }
}
