import java.util.Scanner;

public class PositiveNegativeZero {

    public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int result = checkNumber(num);
        if (result == 1) System.out.println("Number is positive");
        else if (result == -1) System.out.println("Number is negative");
        else System.out.println("Number is zero");
        scanner.close();
    }
}
