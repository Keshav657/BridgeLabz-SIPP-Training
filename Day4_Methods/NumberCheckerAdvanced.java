// NumberCheckerAdvanced.java
public class NumberCheckerAdvanced {
    public static void main(String[] args) {
        int num = 145;
        System.out.println("Is Perfect: " + isPerfect(num));
        System.out.println("Is Abundant: " + isAbundant(num));
        System.out.println("Is Deficient: " + isDeficient(num));
        System.out.println("Is Strong: " + isStrong(num));
    }

    static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0) sum += i;
        return sum;
    }

    static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }

    static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++)
            f *= i;
        return f;
    }
}
