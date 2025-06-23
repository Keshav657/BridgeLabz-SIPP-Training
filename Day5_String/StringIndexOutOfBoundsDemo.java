package Day5_String;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // generateException(text); // Uncomment to see the exception
        handleException(text);
    }

    static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // This will throw StringIndexOutOfBoundsException
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
