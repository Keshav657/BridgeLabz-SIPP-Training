import java.util.Scanner;
public class Q8_PowerCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();
        
        double result = Math.pow(base, exponent);
        System.out.printf("%.2f raised to the power of %.2f is %.2f\n", base, exponent, result);
    }
}
