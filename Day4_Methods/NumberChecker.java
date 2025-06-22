// NumberChecker.java
public class NumberChecker {
    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);
        System.out.println("Digit Count: " + countDigits(num));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits, num));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
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

    static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    static boolean isArmstrongNumber(int[] digits, int original) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits)
            sum += Math.pow(digit, power);
        return sum == original;
    }

    static void findLargestAndSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1)
                max2 = d;
        }
        System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
    }

    static void findSmallestAndSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1)
                min2 = d;
        }
        System.out.println("Smallest: " + min1 + ", Second Smallest: " + min2);
    }
}
