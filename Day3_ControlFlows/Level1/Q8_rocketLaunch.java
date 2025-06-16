package Day3_ControlFlows.Level1;

import java.util.Scanner;

public class Q8_rocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
    }
}
