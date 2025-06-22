import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " age " + ages[i] + ": " + (canVote ? "Can vote" : "Cannot vote"));
        }
        scanner.close();
    }
}
