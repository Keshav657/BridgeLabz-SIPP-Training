package Day2_Java_Constructors;

class Course {
    String courseName;
    int duration; // in weeks
    double fee;
    static String instituteName = "OpenAI Academy";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: $" + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 300.00);
        c1.displayCourseDetails();
        Course.updateInstituteName("TechEd Academy");
        Course c2 = new Course("Python", 8, 350.00);
        c2.displayCourseDetails();
    }
}

