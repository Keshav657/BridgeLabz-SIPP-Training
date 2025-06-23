package Day5_String;

import java.util.Scanner;

public class SubStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String subByCharAt = substringByCharAt(text, start, end);
        String subByMethod = text.substring(start, end);

        System.out.println("Substring using charAt(): " + subByCharAt);
        System.out.println("Substring using substring(): " + subByMethod);
        System.out.println("Are substrings equal? " + compareByCharAt(subByCharAt, subByMethod));
    }

    static String substringByCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    static boolean compareByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}
