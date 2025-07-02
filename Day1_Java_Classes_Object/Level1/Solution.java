package Day1_Java_Classes_Object.Level1;

import java.util.Scanner;

public class Solution {

    public static int minValueToBalance(int[] arr) {
        int n = arr.length;
        int leftSum = 0;
        int rightSum = 0;

        // Sum of left half
        for (int i = 0; i < n / 2; i++) {
            leftSum += arr[i];
        }

        // Sum of right half
        for (int i = n / 2; i < n; i++) {
            rightSum += arr[i];
        }

        // Return absolute difference
        return Math.abs(leftSum - rightSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        System.out.print("");
        int size = scanner.nextInt();

        // Ensure size is even and within constraints
        if (size < 2 || size > 10000000 || size % 2 != 0) {
            System.out.println("Invalid input. Size must be even and between 2 and 10^7.");
            return;
        }

        int[] arr = new int[size];

        // Read array elements
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Compute and display result
        int result = minValueToBalance(arr);
        System.out.println(result);

        scanner.close();
    }
}
