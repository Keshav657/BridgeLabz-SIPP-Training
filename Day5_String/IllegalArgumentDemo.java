package Day5_String;
import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // This will throw an exception and stop the program
        // generateException(text);

        // This will handle the exception
        handleException(text);
    }

    static void generateException(String text) {
        // This will throw StringIndexOutOfBoundsException, which is a subclass of IndexOutOfBoundsException, not IllegalArgumentException
        // But substring with start > end throws StringIndexOutOfBoundsException
        String sub = text.substring(5, 2);
        System.out.println(sub);
    }

    static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println(sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
