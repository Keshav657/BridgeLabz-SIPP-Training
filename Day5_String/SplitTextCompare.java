package Day5_String;
import java.util.Scanner;

public class SplitTextCompare {

    // Method to find length of string without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitTextIntoWords(String text) {
        int length = getStringLength(text);
        int spaceCount = 0;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;

        int[] spaceIndices = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndices[index++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < spaceCount) ? spaceIndices[i] : length;
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                sb.append(text.charAt(j));
            }
            words[i] = sb.toString();
            start = end + 1;
        }
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text line: ");
        String input = scanner.nextLine();

        String[] userSplit = splitTextIntoWords(input);
        String[] builtInSplit = input.split(" ");

        boolean areEqual = compareStringArrays(userSplit, builtInSplit);

        System.out.println("User-defined split result:");
        for (String word : userSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both split results equal? " + areEqual);

        scanner.close();
    }
}
