package Day5_String;
import java.util.Scanner;

public class TrimUsingCharAt {

    // Method to find start and end index after trimming leading and trailing spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create substring using charAt from start to end index
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        int[] indices = findTrimIndices(input);
        String trimmedByMethod = "";
        if (indices[0] <= indices[1]) {
            trimmedByMethod = substringUsingCharAt(input, indices[0], indices[1]);
        }

        String trimmedByBuiltIn = input.trim();

        boolean areEqual = compareStrings(trimmedByMethod, trimmedByBuiltIn);

        System.out.println("Trimmed string by user-defined method: '" + trimmedByMethod + "'");
        System.out.println("Trimmed string by built-in trim(): '" + trimmedByBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        scanner.close();
    }
}
