import java.util.Scanner;

public class MaxHandshakes {

    public static int maxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        int handshakes = maxHandshakes(students);
        System.out.println("Maximum number of handshakes: " + handshakes);
        scanner.close();
    }
}
