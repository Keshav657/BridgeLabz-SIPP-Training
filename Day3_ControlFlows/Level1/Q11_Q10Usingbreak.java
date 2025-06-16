package Day3_ControlFlows.Level1;

import java.util.Scanner;

public class Q11_Q10Usingbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = sc.nextDouble();

            if (value <= 0) {
                break;
            }

            total += value;
        }

        System.out.println("The total sum is: " + total);
    }
}
