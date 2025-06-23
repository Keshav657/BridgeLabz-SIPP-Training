package Day5_String;
import java.util.Scanner;

public class VowelsConsonantsCharType {

    // Method to check if character is vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        char c = ch;
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32); // convert to lowercase
        }
        if (c < 'a' || c > 'z') {
            return "Not a Letter";
        }
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        }
        return "Consonant";
    }

    // Method to find vowels and consonants in a string and return 2D array of char and type
    public static String[][] findCharTypes(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharType(str.charAt(i));
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayCharTypes(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("---------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] charTypes = findCharTypes(input);

        displayCharTypes(charTypes);

        scanner.close();
    }
}
