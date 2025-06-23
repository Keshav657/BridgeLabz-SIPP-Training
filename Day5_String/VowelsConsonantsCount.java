package Day5_String;
import java.util.Scanner;

public class VowelsConsonantsCount {

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

    // Method to count vowels and consonants in a string
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            String type = checkCharType(str.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] counts = countVowelsConsonants(input);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        scanner.close();
    }
}
