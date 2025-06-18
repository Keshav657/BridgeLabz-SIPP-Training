package Day3_Arrays;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3]; // physics, chemistry, maths
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " (Physics, Chemistry, Maths):");
            for (int j = 0; j < 3; j++) {
                double mark = sc.nextDouble();
                while (mark < 0) {
                    System.out.println("Marks cannot be negative. Enter again:");
                    mark = sc.nextDouble();
                }
                marks[i][j] = mark;
            }

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300) * 100;

            double p = percentages[i];
            if (p >= 80) {
                grades[i] = 'A';
            } else if (p >= 70) {
                grades[i] = 'B';
            } else if (p >= 60) {
                grades[i] = 'C';
            } else if (p >= 50) {
                grades[i] = 'D';
            } else if (p >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f%%\t\t%c\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}
