package Day5_String;
import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find length of string without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught when index goes beyond string length
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        int lengthByMethod = getStringLength(input);
        int lengthByBuiltIn = input.length();

        System.out.println("Length by user-defined method: " + lengthByMethod);
        System.out.println("Length by built-in length(): " + lengthByBuiltIn);

        scanner.close();
    }
}
