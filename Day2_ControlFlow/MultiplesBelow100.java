package Day2_ControlFlow;

import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.print("Multiples of " + number + " below 100: ");
            int counter = 1;
            while (number * counter < 100) {
                System.out.print((number * counter) + " ");
                counter++;
            }
            System.out.println();
        }
    }
}