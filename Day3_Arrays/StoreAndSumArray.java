package Day3_Arrays;

import java.util.Scanner;

public class StoreAndSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Input loop
        while (true) {
            if (index == 10) {
                break;
            }
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = sc.nextDouble();
            if (value <= 0) {
                break;
            }
            numbers[index] = value;
            index++;
        }

        // Display numbers and calculate sum
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println();
        System.out.println("Sum of all numbers: " + total);
    }
}

