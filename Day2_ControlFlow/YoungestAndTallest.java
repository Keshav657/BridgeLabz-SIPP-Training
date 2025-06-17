package Day2_ControlFlow;

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height: ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height: ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height: ");
        double heightAnthony = sc.nextDouble();

        // Find youngest
        String youngest;
        int minAge = ageAmar;
        youngest = "Amar";
        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }
        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }

        // Find tallest
        String tallest;
        double maxHeight = heightAmar;
        tallest = "Amar";
        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }
        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }

        System.out.println("The youngest friend is " + youngest + " (" + minAge + " years old).");
        System.out.println("The tallest friend is " + tallest + " (" + maxHeight + " units tall).");
    }
}
