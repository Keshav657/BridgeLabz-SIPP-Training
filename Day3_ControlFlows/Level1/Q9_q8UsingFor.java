package Day3_ControlFlows.Level1;

import java.util.Scanner;

public class Q9_q8UsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
    }
}
