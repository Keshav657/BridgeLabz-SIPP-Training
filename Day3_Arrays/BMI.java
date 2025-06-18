package Day3_Arrays;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // height, weight, BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter height (m) for person " + (i + 1) + ": ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.println("Height must be positive. Enter again:");
                height = sc.nextDouble();
            }

            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.println("Weight must be positive. Enter again:");
                weight = sc.nextDouble();
            }

            personData[i][0] = height;
            personData[i][1] = weight;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
