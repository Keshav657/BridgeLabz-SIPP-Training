// NumberUtility.java
public class NumberUtility {
    public static void main(String[] args) {
        int num = 1729;
        int[] digits = getDigits(num);
        System.out.println("Digit Count: " + countDigits(num));
        System.out.println("Digit Sum: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad: " + isHarshad(num, digits));
        displayDigitFrequency(digits);
    }

    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    static int[] getDigits(int num) {
        String str = Integer.toString(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';
        return digits;
    }

    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    static boolean isHarshad(int num, int[] digits) {
        return num % sumOfDigits(digits) == 0;
    }

    static void displayDigitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        System.out.println("Digit | Frequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.printf("  %d    |    %d\n", i, freq[i]);
        }
    }
}
