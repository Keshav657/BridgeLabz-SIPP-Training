package Day3_ControlFlows.Level1;

import java.util.Scanner;

public class Q17_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus for less than or equal to 5 years of service.");
        }
    }
}
