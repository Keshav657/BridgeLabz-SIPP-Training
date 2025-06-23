package Day5_String;
import java.util.Scanner;

public class NumberFormatException {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid integer
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
    }

    // Method to demonstrate handling NumberFormatException
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format for input '" + text + "'");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to generate NumberFormatException: ");
        String input = scanner.nextLine();

        System.out.println("Calling method to generate exception:");
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception generated: " + e);
        }

        System.out.println("\nCalling method to handle exception:");
        handleException(input);

        scanner.close();
    }
}
