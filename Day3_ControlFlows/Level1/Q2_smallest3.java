package Day3_ControlFlows.Level1;

import java.util.Scanner;

public class Q2_smallest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int a = sc.nextInt();

        System.out.print("Enter number2: ");
        int b = sc.nextInt();

        System.out.print("Enter number3: ");
        int c = sc.nextInt();

        int smallest;

        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}