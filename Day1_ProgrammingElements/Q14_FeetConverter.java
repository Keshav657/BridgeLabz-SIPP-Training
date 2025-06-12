package Day1_ProgrammingElements;

import java.util.Scanner;
public class Q14_FeetConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.printf("The distance in yards is %.2f and in miles is %.2f\n", yards, miles);
        input.close();
    }
}