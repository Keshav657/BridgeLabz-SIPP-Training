package Day1_ProgrammingElements;

import java.util.Scanner;
public class Q10_BasicCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double number1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double number2 = input.nextDouble();
            System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f and %.2f\n",
                    number1, number2, number1 + number2, number1 - number2, number1 * number2, number1 / number2);
        }
    }
}

