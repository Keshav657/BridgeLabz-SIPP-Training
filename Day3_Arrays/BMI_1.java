package Day3_Arrays;

import java.util.Scanner;

public class BMI_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter height (m) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            while (height[i] <= 0) {
                System.out.println("Height must be positive. Enter again:");
                height[i] = sc.nextDouble();
            }

            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            while (weight[i] <= 0) {
                System.out.println("Weight must be positive. Enter again:");
                weight[i] = sc.nextDouble();
            }

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    height[i], weight[i], bmi[i], weightStatus[i]);
        }

        sc.close();
    }
}
