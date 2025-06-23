package Day5_String;
import java.util.Scanner;
import java.util.Arrays;

public class CharArrayComparison {

    // Method to return characters of a string without using toCharArray()
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays and return boolean result
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] userDefinedChars = getChars(input);
        char[] builtInChars = input.toCharArray();

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        System.out.println("Characters from user-defined method: " + Arrays.toString(userDefinedChars));
        System.out.println("Characters from toCharArray(): " + Arrays.toString(builtInChars));
        System.out.println("Are both arrays equal? " + areEqual);

        scanner.close();
    }
}
