package Day1_ProgrammingElements;

import java.util.Scanner;
public class Q15_TotalPrice {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter unit price: ");
            double unitPrice = input.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            double totalPrice = unitPrice * quantity;
            System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f\n", totalPrice, quantity, unitPrice);
        }
    }
}