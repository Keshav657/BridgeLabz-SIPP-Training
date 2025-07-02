package Day2_Java_Constructors;

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);  // Constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);
        defaultCircle.display();
        customCircle.display();
    }
}

