package Day5_String;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] arr) {
        // Accessing index larger than array length to generate exception
        System.out.println("Accessing element at index " + arr.length + ": " + arr[arr.length]);
    }

    // Method to demonstrate handling ArrayIndexOutOfBoundsException
    public static void handleException(String[] arr) {
        try {
            System.out.println("Accessing element at index " + arr.length + ": " + arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of names:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("Calling method to generate exception:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated: " + e);
        }

        System.out.println("\nCalling method to handle exception:");
        handleException(names);

        scanner.close();
    }
}
