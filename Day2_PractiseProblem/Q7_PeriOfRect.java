import java.util.Scanner;
public class Q7_PeriOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        
        double perimeter = 2 * (length + width);
        System.out.printf("The perimeter of the rectangle with length %.2f and width %.2f is %.2f\n", length, width, perimeter);
    }
}
