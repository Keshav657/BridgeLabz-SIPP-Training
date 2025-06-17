package Day2_ControlFlow;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value;

        System.out.print("Enter a number (0 to stop): ");
        value = sc.nextDouble();

        while (value != 0) {
            total += value;
            System.out.print("Enter a number (0 to stop): ");
            value = sc.nextDouble();
        }

        System.out.println("The total sum is " + total);
    }
}
