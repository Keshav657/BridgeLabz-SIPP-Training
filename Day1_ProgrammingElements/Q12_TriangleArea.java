package Day1_ProgrammingElements;

import java.util.Scanner;
public class Q12_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.printf("Area in square inches is %.2f and in square centimeters is %.2f\n", areaInInches, areaInCm);
        input.close();
    }
}