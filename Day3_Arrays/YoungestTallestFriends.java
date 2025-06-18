package Day3_Arrays;

import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter age and height for 3 friends:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Friend " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
            System.out.print("Friend " + (i + 1) + " height (in meters): ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend is Friend " + (youngestIndex + 1) + " with age " + ages[youngestIndex]);
        System.out.println("Tallest friend is Friend " + (tallestIndex + 1) + " with height " + heights[tallestIndex] + " meters");

        sc.close();
    }
}
