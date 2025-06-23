package Day5_String;
import java.util.Random;
import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D String array with age and eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false"; // negative age cannot vote
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Age\tCan Vote");
        System.out.println("----------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] ages = generateRandomAges(n);

        String[][] eligibility = checkVotingEligibility(ages);

        displayResults(eligibility);

        scanner.close();
    }
}
